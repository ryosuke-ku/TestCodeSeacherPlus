// clone pairs:9742:100%
// 10640:flink/flink-table/flink-table-runtime-blink/src/main/java/org/apache/flink/table/dataformat/Decimal.java

public class Nicad_t2_flink386
{
	public static Decimal add(Decimal v1, Decimal v2, int precision, int scale) {
		if (v1.isCompact() && v2.isCompact() && v1.scale == v2.scale) {
			assert scale == v1.scale; // no need to rescale
			try {
				long ls = Math.addExact(v1.longVal, v2.longVal); // checks overflow
				return new Decimal(precision, scale, ls, null);
			} catch (ArithmeticException e) {
				// overflow, fall through
			}
		}
		BigDecimal bd = v1.toBigDecimal().add(v2.toBigDecimal());
		return fromBigDecimal(bd, precision, scale);
	}
}