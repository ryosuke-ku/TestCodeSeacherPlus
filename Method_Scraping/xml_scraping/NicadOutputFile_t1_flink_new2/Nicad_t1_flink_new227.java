// clone pairs:2779:85%
// 4070:flink/flink-core/src/main/java/org/apache/flink/api/common/typeutils/base/StringComparator.java

public class Nicad_t1_flink_new227
{
	public void putNormalizedKey(String record, MemorySegment target, int offset, int len) {
		final int limit = offset + len;
		final int end = record.length();
		int pos = 0;
		
		while (pos < end && offset < limit) {
			char c = record.charAt(pos++);
			if (c < HIGH_BIT) {
				target.put(offset++, (byte) c);
			}
			else if (c < HIGH_BIT2) {
				target.put(offset++, (byte) ((c >>> 7) | HIGH_BIT));
				if (offset < limit) {
					target.put(offset++, (byte) c);
				}
			}
			else {
				target.put(offset++, (byte) ((c >>> 10) | HIGH_BIT2_MASK));
				if (offset < limit) {
					target.put(offset++, (byte) (c >>> 2));
				}
				if (offset < limit) {
					target.put(offset++, (byte) c);
				}
			}
		}
		while (offset < limit) {
			target.put(offset++, (byte) 0);
		}
	}
}