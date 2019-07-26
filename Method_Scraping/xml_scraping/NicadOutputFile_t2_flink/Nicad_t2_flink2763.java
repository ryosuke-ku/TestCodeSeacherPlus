// clone pairs:27555:90%
// 43223:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/handler/job/savepoints/SavepointHandlers.java

public class Nicad_t2_flink2763
{
		protected CompletableFuture<String> triggerOperation(
				final HandlerRequest<StopWithSavepointRequestBody, SavepointTriggerMessageParameters> request,
				final RestfulGateway gateway) throws RestHandlerException {

			final JobID jobId = request.getPathParameter(JobIDPathParameter.class);
			final String requestedTargetDirectory = request.getRequestBody().getTargetDirectory();

			if (requestedTargetDirectory == null && defaultSavepointDir == null) {
				throw new RestHandlerException(
						String.format("Config key [%s] is not set. Property [%s] must be provided.",
								CheckpointingOptions.SAVEPOINT_DIRECTORY.key(),
								StopWithSavepointRequestBody.FIELD_NAME_TARGET_DIRECTORY),
						HttpResponseStatus.BAD_REQUEST);
			}

			final boolean advanceToEndOfEventTime = request.getRequestBody().shouldAdvanceToEndOfEventTime();
			final String targetDirectory = requestedTargetDirectory != null ? requestedTargetDirectory : defaultSavepointDir;
			return gateway.stopWithSavepoint(jobId, targetDirectory, advanceToEndOfEventTime, RpcUtils.INF_TIMEOUT);
		}
}