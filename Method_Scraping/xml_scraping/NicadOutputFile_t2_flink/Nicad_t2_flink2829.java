// clone pairs:28140:100%
// 44351:flink/flink-libraries/flink-gelly/src/main/java/org/apache/flink/graph/types/valuearray/IntValueArray.java

public class Nicad_t2_flink2829
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