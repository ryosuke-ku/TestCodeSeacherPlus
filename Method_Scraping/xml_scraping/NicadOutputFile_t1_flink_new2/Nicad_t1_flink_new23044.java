// clone pairs:17972:90%
// 24653:flink/flink-table/flink-table-common/src/main/java/org/apache/flink/table/types/DataType.java

public class Nicad_t1_flink_new23044
{
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		DataType dataType = (DataType) o;
		return logicalType.equals(dataType.logicalType) &&
			conversionClass.equals(dataType.conversionClass);
	}
}