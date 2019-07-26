// clone pairs:28121:100%
// 44313:flink/flink-libraries/flink-gelly/src/main/java/org/apache/flink/graph/types/valuearray/IntValueArray.java

public class Nicad_t2_flink2810
{
	public void copyNormalizedKey(MemorySegment target, int offset, int len) {
		hash.reset();

		hash.hash(position);
		for (int i = 0; i < position; i++) {
			hash.hash(data[i]);
		}

		hashValue.setValue(hash.hash());
		hashValue.copyNormalizedKey(target, offset, len);
	}
}