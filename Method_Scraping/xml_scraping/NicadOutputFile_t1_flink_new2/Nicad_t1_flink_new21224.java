// clone pairs:13594:90%
// 16236:flink/flink-table/flink-table-runtime-blink/src/main/java/org/apache/flink/table/typeutils/DecimalSerializer.java

public class Nicad_t1_flink_new21224
{
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		DecimalSerializer that = (DecimalSerializer) o;

		return precision == that.precision && scale == that.scale;
	}
}