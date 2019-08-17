// clone pairs:11625:90%
// 13294:flink/flink-table/flink-table-common/src/main/java/org/apache/flink/table/types/DataType.java

public class Nicad_t1_flink_new2804
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