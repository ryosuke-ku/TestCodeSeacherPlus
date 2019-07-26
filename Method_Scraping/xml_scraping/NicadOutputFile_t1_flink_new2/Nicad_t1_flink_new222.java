// clone pairs:2307:100%
// 3664:flink/flink-java/src/main/java/org/apache/flink/api/java/io/CsvOutputFormat.java

public class Nicad_t1_flink_new222
{
	public void writeRecord(T element) throws IOException {
		int numFields = element.getArity();

		for (int i = 0; i < numFields; i++) {
			Object v = element.getField(i);
			if (v != null) {
				if (i != 0) {
					this.wrt.write(this.fieldDelimiter);
				}

				if (quoteStrings) {
					if (v instanceof String || v instanceof StringValue) {
						this.wrt.write('"');
						this.wrt.write(v.toString());
						this.wrt.write('"');
					} else {
						this.wrt.write(v.toString());
					}
				} else {
					this.wrt.write(v.toString());
				}
			} else {
				if (this.allowNullValues) {
					if (i != 0) {
						this.wrt.write(this.fieldDelimiter);
					}
				} else {
					throw new RuntimeException("Cannot write tuple with <null> value at position: " + i);
				}
			}
		}

		// add the record delimiter
		this.wrt.write(this.recordDelimiter);
	}
}