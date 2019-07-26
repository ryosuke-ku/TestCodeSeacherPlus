// clone pairs:10307:81%
// 11364:flink/flink-libraries/flink-gelly-examples/src/main/java/org/apache/flink/graph/drivers/transform/GraphKeyTypeTransform.java

public class Nicad_t2_flink517
{
		public ByteValue translate(LongValue value, ByteValue reuse)
				throws Exception {
			if (reuse == null) {
				reuse = new ByteValue();
			}

			long l = value.getValue();

			if (l < 0 || l >= MAX_VERTEX_COUNT) {
				throw new IllegalArgumentException("Cannot cast long value " + value + " to byte.");
			}

			reuse.setValue((byte) (l & (MAX_VERTEX_COUNT - 1)));
			return reuse;
		}
}