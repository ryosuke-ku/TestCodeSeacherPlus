// clone pairs:8900:84%
// 9865:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/JobVertexTaskManagersInfo.java

public class Nicad_t2_flink326
{
	public JobVertexTaskManagersInfo(
			@JsonDeserialize(using = JobVertexIDDeserializer.class) @JsonProperty(VERTEX_TASK_FIELD_ID) JobVertexID jobVertexID,
			@JsonProperty(VERTEX_TASK_FIELD_NAME) String name,
			@JsonProperty(VERTEX_TASK_FIELD_NOW) long now,
			@JsonProperty(VERTEX_TASK_FIELD_TASK_MANAGERS) Collection<TaskManagersInfo> taskManagerInfos) {
		this.jobVertexID = checkNotNull(jobVertexID);
		this.name = checkNotNull(name);
		this.now = now;
		this.taskManagerInfos = checkNotNull(taskManagerInfos);
	}
}