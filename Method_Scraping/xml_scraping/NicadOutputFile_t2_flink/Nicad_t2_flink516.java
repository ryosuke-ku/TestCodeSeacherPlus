// clone pairs:10306:81%
// 11362:flink/flink-libraries/flink-gelly-examples/src/main/java/org/apache/flink/graph/drivers/transform/GraphKeyTypeTransform.java

public class Nicad_t2_flink516
{
		public ShortValue translate(LongValue value, ShortValue reuse)
				throws Exception {
			if (reuse == null) {
				reuse = new ShortValue();
			}

			long l = value.getValue();

			if (l < 0 || l >= MAX_VERTEX_COUNT) {
				throw new IllegalArgumentException("Cannot cast long value " + value + " to short.");
			}

			reuse.setValue((short) (l & (MAX_VERTEX_COUNT - 1)));
			return reuse;
		}
}