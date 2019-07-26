// clone pairs:23161:90%
// 34371:flink/flink-connectors/flink-connector-filesystem/src/main/java/org/apache/flink/streaming/connectors/fs/StringWriter.java

public class Nicad_t1_flink_new25321
{
	public void open(FileSystem fs, Path path) throws IOException {
		super.open(fs, path);

		try {
			this.charset = Charset.forName(charsetName);
		}
		catch (IllegalCharsetNameException e) {
			throw new IOException("The charset " + charsetName + " is not valid.", e);
		}
		catch (UnsupportedCharsetException e) {
			throw new IOException("The charset " + charsetName + " is not supported.", e);
		}
	}
}