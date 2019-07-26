// clone pairs:10305:81%
// 11360:flink/flink-libraries/flink-gelly-examples/src/main/java/org/apache/flink/graph/drivers/transform/GraphKeyTypeTransform.java

public class Nicad_t2_flink515
{
		public CharValue translate(LongValue value, CharValue reuse)
				throws Exception {
			if (reuse == null) {
				reuse = new CharValue();
			}

			long l = value.getValue();

			if (l < 0 || l >= MAX_VERTEX_COUNT) {
				throw new IllegalArgumentException("Cannot cast long value " + value + " to char.");
			}

			reuse.setValue((char) (l & (MAX_VERTEX_COUNT - 1)));
			return reuse;
		}
}