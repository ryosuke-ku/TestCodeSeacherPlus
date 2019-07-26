// clone pairs:5462:100%
// 5862:flink/flink-core/src/main/java/org/apache/flink/core/memory/DataInputDeserializer.java

public class Nicad_t2_flink126
{
	public String readLine() throws IOException {
		if (this.position < this.end) {
			// read until a newline is found
			StringBuilder bld = new StringBuilder();
			char curr = (char) readUnsignedByte();
			while (position < this.end && curr != '\n') {
				bld.append(curr);
				curr = (char) readUnsignedByte();
			}
			// trim a trailing carriage return
			int len = bld.length();
			if (len > 0 && bld.charAt(len - 1) == '\r') {
				bld.setLength(len - 1);
			}
			String s = bld.toString();
			bld.setLength(0);
			return s;
		} else {
			return null;
		}
	}
}