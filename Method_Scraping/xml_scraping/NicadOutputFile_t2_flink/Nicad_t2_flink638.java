// clone pairs:11447:80%
// 13041:flink/flink-core/src/main/java/org/apache/flink/types/Row.java

public class Nicad_t2_flink638
{
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		Row row = (Row) o;

		return Arrays.deepEquals(fields, row.fields);
	}
}