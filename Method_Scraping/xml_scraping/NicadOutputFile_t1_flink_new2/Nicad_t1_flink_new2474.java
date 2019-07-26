// clone pairs:10274:72%
// 11254:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/checkpoints/CheckpointingStatistics.java

public class Nicad_t1_flink_new2474
{
		public RestoredCheckpointStatistics(
				@JsonProperty(FIELD_NAME_ID) long id,
				@JsonProperty(FIELD_NAME_RESTORE_TIMESTAMP) long restoreTimestamp,
				@JsonProperty(FIELD_NAME_IS_SAVEPOINT) boolean savepoint,
				@JsonProperty(FIELD_NAME_EXTERNAL_PATH) @Nullable String externalPath) {
			this.id = id;
			this.restoreTimestamp = restoreTimestamp;
			this.savepoint = savepoint;
			this.externalPath = externalPath;
		}
}