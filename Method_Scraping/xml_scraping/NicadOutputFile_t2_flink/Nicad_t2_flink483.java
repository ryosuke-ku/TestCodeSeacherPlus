// clone pairs:10148:81%
// 11135:flink/flink-libraries/flink-gelly/src/main/java/org/apache/flink/graph/asm/translate/translators/LongValueToUnsignedIntValue.java

public class Nicad_t2_flink483
{
	public IntValue translate(LongValue value, IntValue reuse)
			throws Exception {
		if (reuse == null) {
			reuse = new IntValue();
		}

		long l = value.getValue();

		if (l < 0 || l >= MAX_VERTEX_COUNT) {
			throw new IllegalArgumentException("Cannot cast long value " + value + " to integer.");
		}

		reuse.setValue((int) (l & (MAX_VERTEX_COUNT - 1)));
		return reuse;
	}
}