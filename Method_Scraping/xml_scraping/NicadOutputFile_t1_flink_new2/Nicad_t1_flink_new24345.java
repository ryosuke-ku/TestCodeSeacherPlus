// clone pairs:20898:80%
// 30203:flink/flink-streaming-java/src/main/java/org/apache/flink/streaming/runtime/tasks/OperatorChain.java

public class Nicad_t1_flink_new24345
{
		public void emitWatermark(Watermark mark) {
			try {
				watermarkGauge.setCurrentWatermark(mark.getTimestamp());
				if (streamStatusProvider.getStreamStatus().isActive()) {
					operator.processWatermark(mark);
				}
			}
			catch (Exception e) {
				throw new ExceptionInChainedOperatorException(e);
			}
		}
}