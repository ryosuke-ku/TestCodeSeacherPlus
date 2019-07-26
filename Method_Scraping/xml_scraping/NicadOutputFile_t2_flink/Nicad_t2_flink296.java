// clone pairs:7973:92%
// 8098:flink/flink-connectors/flink-connector-kafka-base/src/main/java/org/apache/flink/streaming/connectors/kafka/FlinkKafkaConsumerBase.java

public class Nicad_t2_flink296
{
	public FlinkKafkaConsumerBase<T> assignTimestampsAndWatermarks(AssignerWithPunctuatedWatermarks<T> assigner) {
		checkNotNull(assigner);

		if (this.periodicWatermarkAssigner != null) {
			throw new IllegalStateException("A periodic watermark emitter has already been set.");
		}
		try {
			ClosureCleaner.clean(assigner, true);
			this.punctuatedWatermarkAssigner = new SerializedValue<>(assigner);
			return this;
		} catch (Exception e) {
			throw new IllegalArgumentException("The given assigner is not serializable", e);
		}
	}
}