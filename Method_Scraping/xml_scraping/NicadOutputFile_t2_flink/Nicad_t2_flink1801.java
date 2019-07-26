// clone pairs:24898:70%
// 38001:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/SubtasksTimesInfo.java

public class Nicad_t2_flink1801
{
	public SubtasksTimesInfo(
			@JsonProperty(FIELD_NAME_ID) String id,
			@JsonProperty(FIELD_NAME_NAME) String name,
			@JsonProperty(FIELD_NAME_NOW) long now,
			@JsonProperty(FIELD_NAME_SUBTASKS) List<SubtaskTimeInfo> subtasks) {
		this.id = checkNotNull(id);
		this.name = checkNotNull(name);
		this.now = now;
		this.subtasks = checkNotNull(subtasks);
	}
}