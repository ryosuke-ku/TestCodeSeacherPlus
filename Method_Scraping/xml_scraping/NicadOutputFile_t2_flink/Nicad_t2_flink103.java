// clone pairs:5055:90%
// 5656:flink/flink-core/src/main/java/org/apache/flink/types/parser/FloatValueParser.java

public class Nicad_t2_flink103
{
	public int parseField(byte[] bytes, int startPos, int limit, byte[] delimiter, FloatValue reusable) {
		final int endPos = nextStringEndPos(bytes, startPos, limit, delimiter);
		if (endPos < 0) {
			return -1;
		}

		if (endPos > startPos &&
				(Character.isWhitespace(bytes[startPos]) || Character.isWhitespace(bytes[endPos - 1]))) {
			setErrorState(ParseErrorState.NUMERIC_VALUE_ILLEGAL_CHARACTER);
			return -1;
		}

		String str = new String(bytes, startPos, endPos - startPos, ConfigConstants.DEFAULT_CHARSET);
		try {
			float value = Float.parseFloat(str);
			reusable.setValue(value);
			this.result = reusable;
			return (endPos == limit) ? limit : endPos + delimiter.length;
		}
		catch (NumberFormatException e) {
			setErrorState(ParseErrorState.NUMERIC_VALUE_FORMAT_ERROR);
			return -1;
		}
	}
}