// clone pairs:20895:80%
// 30196:flink/flink-streaming-java/src/main/java/org/apache/flink/streaming/runtime/tasks/OperatorChain.java

public class Nicad_t1_flink_new24342
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