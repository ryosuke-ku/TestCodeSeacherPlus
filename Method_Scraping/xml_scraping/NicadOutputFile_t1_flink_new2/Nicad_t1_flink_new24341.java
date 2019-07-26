// clone pairs:20894:80%
// 30194:flink/flink-streaming-java/src/main/java/org/apache/flink/streaming/runtime/tasks/OperatorChain.java

public class Nicad_t1_flink_new24341
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