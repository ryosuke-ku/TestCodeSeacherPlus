// clone pairs:7582:71%
// 7483:flink/flink-java/src/main/java/org/apache/flink/api/java/operators/DataSink.java

public class Nicad_t1_flink_new2125
{
	public DataSink(DataSet<T> data, OutputFormat<T> format, TypeInformation<T> type) {
		if (format == null) {
			throw new IllegalArgumentException("The output format must not be null.");
		}
		if (type == null) {
			throw new IllegalArgumentException("The input type information must not be null.");
		}
		if (data == null) {
			throw new IllegalArgumentException("The data set must not be null.");
		}

		this.format = format;
		this.data = data;
		this.type = type;
	}
}