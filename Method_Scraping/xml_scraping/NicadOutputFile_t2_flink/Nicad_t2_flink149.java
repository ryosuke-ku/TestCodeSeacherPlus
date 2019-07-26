// clone pairs:5740:77%
// 6054:flink/flink-connectors/flink-connector-kafka-base/src/main/java/org/apache/flink/streaming/connectors/kafka/internals/AbstractFetcher.java

public class Nicad_t2_flink149
{
	protected void emitRecord(T record, KafkaTopicPartitionState<KPH> partitionState, long offset) throws Exception {

		if (record != null) {
			if (timestampWatermarkMode == NO_TIMESTAMPS_WATERMARKS) {
				// fast path logic, in case there are no watermarks

				// emit the record, using the checkpoint lock to guarantee
				// atomicity of record emission and offset state update
				synchronized (checkpointLock) {
					sourceContext.collect(record);
					partitionState.setOffset(offset);
				}
			} else if (timestampWatermarkMode == PERIODIC_WATERMARKS) {
				emitRecordWithTimestampAndPeriodicWatermark(record, partitionState, offset, Long.MIN_VALUE);
			} else {
				emitRecordWithTimestampAndPunctuatedWatermark(record, partitionState, offset, Long.MIN_VALUE);
			}
		} else {
			// if the record is null, simply just update the offset state for partition
			synchronized (checkpointLock) {
				partitionState.setOffset(offset);
			}
		}
	}
}