// clone pairs:6283:94%
// 6424:flink/flink-table/flink-table-runtime-blink/src/main/java/org/apache/flink/table/util/SegmentsUtil.java

public class Nicad_t2_flink174
{
	private static void copyMultiSegmentsToUnsafe(
			MemorySegment[] segments,
			int offset,
			Object target,
			int pointer,
			int numBytes) {
		int remainSize = numBytes;
		for (MemorySegment segment : segments) {
			int remain = segment.size() - offset;
			if (remain > 0) {
				int nCopy = Math.min(remain, remainSize);
				segment.copyToUnsafe(offset, target, numBytes - remainSize + pointer, nCopy);
				remainSize -= nCopy;
				// next new segment.
				offset = 0;
				if (remainSize == 0) {
					return;
				}
			} else {
				// remain is negative, let's advance to next segment
				// now the offset = offset - segmentSize (-remain)
				offset = -remain;
			}
		}
	}
}