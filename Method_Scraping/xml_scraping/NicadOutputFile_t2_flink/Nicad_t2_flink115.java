// clone pairs:5077:90%
// 5696:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/handler/job/SubtaskExecutionAttemptDetailsHandler.java

public class Nicad_t2_flink115
{
	public Collection<ArchivedJson> archiveJsonWithPath(AccessExecutionGraph graph) throws IOException {
		List<ArchivedJson> archive = new ArrayList<>(16);
		for (AccessExecutionJobVertex task : graph.getAllVertices().values()) {
			for (AccessExecutionVertex subtask : task.getTaskVertices()) {
				ResponseBody curAttemptJson = createDetailsInfo(subtask.getCurrentExecutionAttempt(), graph.getJobID(), task.getJobVertexId(), null);
				String curAttemptPath = getMessageHeaders().getTargetRestEndpointURL()
					.replace(':' + JobIDPathParameter.KEY, graph.getJobID().toString())
					.replace(':' + JobVertexIdPathParameter.KEY, task.getJobVertexId().toString())
					.replace(':' + SubtaskIndexPathParameter.KEY, String.valueOf(subtask.getParallelSubtaskIndex()))
					.replace(':' + SubtaskAttemptPathParameter.KEY, String.valueOf(subtask.getCurrentExecutionAttempt().getAttemptNumber()));

				archive.add(new ArchivedJson(curAttemptPath, curAttemptJson));

				for (int x = 0; x < subtask.getCurrentExecutionAttempt().getAttemptNumber(); x++) {
					AccessExecution attempt = subtask.getPriorExecutionAttempt(x);
					if (attempt != null) {
						ResponseBody json = createDetailsInfo(attempt, graph.getJobID(), task.getJobVertexId(), null);
						String path = getMessageHeaders().getTargetRestEndpointURL()
							.replace(':' + JobIDPathParameter.KEY, graph.getJobID().toString())
							.replace(':' + JobVertexIdPathParameter.KEY, task.getJobVertexId().toString())
							.replace(':' + SubtaskIndexPathParameter.KEY, String.valueOf(subtask.getParallelSubtaskIndex()))
							.replace(':' + SubtaskAttemptPathParameter.KEY, String.valueOf(attempt.getAttemptNumber()));
						archive.add(new ArchivedJson(path, json));
					}
				}
			}
		}
		return archive;
	}
}