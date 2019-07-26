// clone pairs:6543:81%
// 6652:flink/flink-clients/src/main/java/org/apache/flink/client/program/rest/RestClusterClient.java

public class Nicad_t2_flink205
{
	public String stopWithSavepoint(
			final JobID jobId,
			final boolean advanceToEndOfTime,
			@Nullable final String savepointDirectory) throws Exception {

		final StopWithSavepointTriggerHeaders stopWithSavepointTriggerHeaders = StopWithSavepointTriggerHeaders.getInstance();

		final SavepointTriggerMessageParameters stopWithSavepointTriggerMessageParameters =
				stopWithSavepointTriggerHeaders.getUnresolvedMessageParameters();
		stopWithSavepointTriggerMessageParameters.jobID.resolve(jobId);

		final CompletableFuture<TriggerResponse> responseFuture = sendRequest(
				stopWithSavepointTriggerHeaders,
				stopWithSavepointTriggerMessageParameters,
				new StopWithSavepointRequestBody(savepointDirectory, advanceToEndOfTime));

		return responseFuture.thenCompose(savepointTriggerResponseBody -> {
			final TriggerId savepointTriggerId = savepointTriggerResponseBody.getTriggerId();
			return pollSavepointAsync(jobId, savepointTriggerId);
		}).thenApply(savepointInfo -> {
			if (savepointInfo.getFailureCause() != null) {
				throw new CompletionException(savepointInfo.getFailureCause());
			}
			return savepointInfo.getLocation();
		}).get();
	}
}