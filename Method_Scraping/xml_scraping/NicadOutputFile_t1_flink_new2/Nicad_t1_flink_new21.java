// clone pairs:21:82%
// 35:flink/flink-runtime-web/src/main/java/org/apache/flink/runtime/webmonitor/history/HistoryServerStaticFileServerHandler.java

public class Nicad_t1_flink_new21
{
	private void respondWithFile(ChannelHandlerContext ctx, HttpRequest request, String requestPath)
		throws IOException, ParseException {

		// make sure we request the "index.html" in case there is a directory request
		if (requestPath.endsWith("/")) {
			requestPath = requestPath + "index.html";
		}

		if (!requestPath.contains(".")) { // we assume that the path ends in either .html or .js
			requestPath = requestPath + ".json";
		}

		// convert to absolute path
		final File file = new File(rootPath, requestPath);

		if (!file.exists()) {
			// file does not exist. Try to load it with the classloader
			ClassLoader cl = HistoryServerStaticFileServerHandler.class.getClassLoader();

			try (InputStream resourceStream = cl.getResourceAsStream("web" + requestPath)) {
				boolean success = false;
				try {
					if (resourceStream != null) {
						URL root = cl.getResource("web");
						URL requested = cl.getResource("web" + requestPath);

						if (root != null && requested != null) {
							URI rootURI = new URI(root.getPath()).normalize();
							URI requestedURI = new URI(requested.getPath()).normalize();

							// Check that we don't load anything from outside of the
							// expected scope.
							if (!rootURI.relativize(requestedURI).equals(requestedURI)) {
								LOG.debug("Loading missing file from classloader: {}", requestPath);
								// ensure that directory to file exists.
								file.getParentFile().mkdirs();
								Files.copy(resourceStream, file.toPath());

								success = true;
							}
						}
					}
				} catch (Throwable t) {
					LOG.error("error while responding", t);
				} finally {
					if (!success) {
						LOG.debug("Unable to load requested file {} from classloader", requestPath);
						HandlerUtils.sendErrorResponse(
							ctx,
							request,
							new ErrorResponseBody("File not found."),
							NOT_FOUND,
							Collections.emptyMap());
						return;
					}
				}
			}
		}

		if (!file.exists() || file.isHidden() || file.isDirectory() || !file.isFile()) {
			HandlerUtils.sendErrorResponse(
				ctx,
				request,
				new ErrorResponseBody("File not found."),
				NOT_FOUND,
				Collections.emptyMap());
			return;
		}

		if (!file.getCanonicalFile().toPath().startsWith(rootPath.toPath())) {
			HandlerUtils.sendErrorResponse(
				ctx,
				request,
				new ErrorResponseBody("File not found."),
				NOT_FOUND,
				Collections.emptyMap());
			return;
		}

		// cache validation
		final String ifModifiedSince = request.headers().get(IF_MODIFIED_SINCE);
		if (ifModifiedSince != null && !ifModifiedSince.isEmpty()) {
			SimpleDateFormat dateFormatter = new SimpleDateFormat(StaticFileServerHandler.HTTP_DATE_FORMAT, Locale.US);
			Date ifModifiedSinceDate = dateFormatter.parse(ifModifiedSince);

			// Only compare up to the second because the datetime format we send to the client
			// does not have milliseconds
			long ifModifiedSinceDateSeconds = ifModifiedSinceDate.getTime() / 1000;
			long fileLastModifiedSeconds = file.lastModified() / 1000;
			if (ifModifiedSinceDateSeconds == fileLastModifiedSeconds) {
				if (LOG.isDebugEnabled()) {
					LOG.debug("Responding 'NOT MODIFIED' for file '" + file.getAbsolutePath() + '\'');
				}

				StaticFileServerHandler.sendNotModified(ctx);
				return;
			}
		}

		if (LOG.isDebugEnabled()) {
			LOG.debug("Responding with file '" + file.getAbsolutePath() + '\'');
		}

		// Don't need to close this manually. Netty's DefaultFileRegion will take care of it.
		final RandomAccessFile raf;
		try {
			raf = new RandomAccessFile(file, "r");
		} catch (FileNotFoundException e) {
			HandlerUtils.sendErrorResponse(
				ctx,
				request,
				new ErrorResponseBody("File not found."),
				NOT_FOUND,
				Collections.emptyMap());
			return;
		}

		try {
			long fileLength = raf.length();

			HttpResponse response = new DefaultHttpResponse(HTTP_1_1, OK);
			StaticFileServerHandler.setContentTypeHeader(response, file);

			// the job overview should be updated as soon as possible
			if (!requestPath.equals("/joboverview.json")) {
				StaticFileServerHandler.setDateAndCacheHeaders(response, file);
			}
			if (HttpHeaders.isKeepAlive(request)) {
				response.headers().set(CONNECTION, HttpHeaders.Values.KEEP_ALIVE);
			}
			HttpHeaders.setContentLength(response, fileLength);

			// write the initial line and the header.
			ctx.write(response);

			// write the content.
			ChannelFuture lastContentFuture;
			if (ctx.pipeline().get(SslHandler.class) == null) {
				ctx.write(new DefaultFileRegion(raf.getChannel(), 0, fileLength), ctx.newProgressivePromise());
				lastContentFuture = ctx.writeAndFlush(LastHttpContent.EMPTY_LAST_CONTENT);
			} else {
				lastContentFuture = ctx.writeAndFlush(new HttpChunkedInput(new ChunkedFile(raf, 0, fileLength, 8192)),
					ctx.newProgressivePromise());
				// HttpChunkedInput will write the end marker (LastHttpContent) for us.
			}

			// close the connection, if no keep-alive is needed
			if (!HttpHeaders.isKeepAlive(request)) {
				lastContentFuture.addListener(ChannelFutureListener.CLOSE);
			}
		} catch (Exception e) {
			raf.close();
			LOG.error("Failed to serve file.", e);
			HandlerUtils.sendErrorResponse(
				ctx,
				request,
				new ErrorResponseBody("Internal server error."),
				INTERNAL_SERVER_ERROR,
				Collections.emptyMap());
		}
	}
}