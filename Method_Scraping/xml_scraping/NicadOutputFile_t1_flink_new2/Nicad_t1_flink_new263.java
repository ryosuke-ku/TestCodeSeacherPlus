// clone pairs:5835:72%
// 6177:flink/flink-core/src/main/java/org/apache/flink/api/common/typeutils/base/DateComparator.java

public class Nicad_t1_flink_new263
{
	public static void putNormalizedKeyDate(Date record, MemorySegment target, int offset, int numBytes) {
		final long value = record.getTime() - Long.MIN_VALUE;

		// see IntValue for an explanation of the logic
		if (numBytes == 8) {
			// default case, full normalized key
			target.putLongBigEndian(offset, value);
		}
		else if (numBytes < 8) {
			for (int i = 0; numBytes > 0; numBytes--, i++) {
				target.put(offset + i, (byte) (value >>> ((7-i)<<3)));
			}
		}
		else {
			target.putLongBigEndian(offset, value);
			for (int i = 8; i < numBytes; i++) {
				target.put(offset + i, (byte) 0);
			}
		}
	}
}