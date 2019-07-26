// clone pairs:11540:90%
// 13223:flink/flink-core/src/main/java/org/apache/flink/core/memory/DataInputDeserializer.java

public class Nicad_t2_flink688
{
	public int skipBytes(int n) {
		if (this.position <= this.end - n) {
			this.position += n;
			return n;
		} else {
			n = this.end - this.position;
			this.position = this.end;
			return n;
		}
	}
}