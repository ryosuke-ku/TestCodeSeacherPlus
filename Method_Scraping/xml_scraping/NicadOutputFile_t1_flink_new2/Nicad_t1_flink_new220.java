// clone pairs:1114:92%
// 1751:flink/flink-connectors/flink-connector-filesystem/src/main/java/org/apache/flink/streaming/connectors/fs/bucketing/BucketingSink.java

public class Nicad_t1_flink_new220
{
	private Method reflectTruncate(FileSystem fs) {
		// completely disable the check for truncate() because the check can be problematic
		// on some filesystem implementations
		if (!useTruncate) {
			return null;
		}

		Method m = null;
		if (fs != null) {
			Class<?> fsClass = fs.getClass();
			try {
				m = fsClass.getMethod("truncate", Path.class, long.class);
			} catch (NoSuchMethodException ex) {
				LOG.debug("Truncate not found. Will write a file with suffix '{}' " +
					" and prefix '{}' to specify how many bytes in a bucket are valid.", validLengthSuffix, validLengthPrefix);
				return null;
			}

			// verify that truncate actually works
			Path testPath = new Path(basePath, UUID.randomUUID().toString());
			try {
				try (FSDataOutputStream outputStream = fs.create(testPath)) {
					outputStream.writeUTF("hello");
				} catch (IOException e) {
					LOG.error("Could not create file for checking if truncate works.", e);
					throw new RuntimeException(
							"Could not create file for checking if truncate works. " +
									"You can disable support for truncate() completely via " +
									"BucketingSink.setUseTruncate(false).", e);
				}

				try {
					m.invoke(fs, testPath, 2);
				} catch (IllegalAccessException | InvocationTargetException e) {
					LOG.debug("Truncate is not supported.", e);
					m = null;
				}
			} finally {
				try {
					fs.delete(testPath, false);
				} catch (IOException e) {
					LOG.error("Could not delete truncate test file.", e);
					throw new RuntimeException("Could not delete truncate test file. " +
							"You can disable support for truncate() completely via " +
							"BucketingSink.setUseTruncate(false).", e);
				}
			}
		}
		return m;
	}
}