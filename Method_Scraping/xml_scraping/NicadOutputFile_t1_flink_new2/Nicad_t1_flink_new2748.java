// clone pairs:11481:90%
// 13026:flink/flink-core/src/main/java/org/apache/flink/types/Row.java

public class Nicad_t1_flink_new2748
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