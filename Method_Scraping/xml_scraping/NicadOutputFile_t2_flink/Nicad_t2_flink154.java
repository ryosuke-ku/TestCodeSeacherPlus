// clone pairs:5801:77%
// 6142:flink/flink-core/src/main/java/org/apache/flink/types/parser/SqlTimeParser.java

public class Nicad_t2_flink154
{
	public int parseField(byte[] bytes, int startPos, int limit, byte[] delimiter, Time reusable) {
		final int endPos = nextStringEndPos(bytes, startPos, limit, delimiter);
		if (endPos < 0) {
			return -1;
		}

		String str = new String(bytes, startPos, endPos - startPos, ConfigConstants.DEFAULT_CHARSET);
		try {
			this.result = Time.valueOf(str);
			return (endPos == limit) ? limit : endPos + delimiter.length;
		} catch (IllegalArgumentException e) {
			setErrorState(ParseErrorState.NUMERIC_VALUE_FORMAT_ERROR);
			return -1;
		}
	}
}