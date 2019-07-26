// clone pairs:13459:90%
// 15970:flink/flink-table/flink-table-runtime-blink/src/main/java/org/apache/flink/table/typeutils/DecimalSerializer.java

public class Nicad_t1_flink_new21153
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