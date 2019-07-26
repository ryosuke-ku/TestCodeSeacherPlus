// clone pairs:11358:90%
// 12867:flink/flink-table/flink-table-runtime-blink/src/main/java/org/apache/flink/table/typeutils/DecimalSerializer.java

public class Nicad_t2_flink620
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