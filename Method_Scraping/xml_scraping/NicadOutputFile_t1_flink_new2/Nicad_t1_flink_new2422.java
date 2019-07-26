// clone pairs:9666:100%
// 10469:flink/flink-java/src/main/java/org/apache/flink/api/java/io/CsvOutputFormat.java

public class Nicad_t1_flink_new2422
{
	public CsvOutputFormat(Path outputPath, String recordDelimiter, String fieldDelimiter) {
		super(outputPath);
		if (recordDelimiter == null) {
			throw new IllegalArgumentException("RecordDelmiter shall not be null.");
		}

		if (fieldDelimiter == null) {
			throw new IllegalArgumentException("FieldDelimiter shall not be null.");
		}

		this.fieldDelimiter = fieldDelimiter;
		this.recordDelimiter = recordDelimiter;
		this.allowNullValues = false;
	}
}