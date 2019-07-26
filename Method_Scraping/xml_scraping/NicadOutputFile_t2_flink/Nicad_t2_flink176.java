// clone pairs:6294:94%
// 6436:flink/flink-table/flink-table-runtime-blink/src/main/java/org/apache/flink/table/util/SegmentsUtil.java

public class Nicad_t2_flink176
{
	public static void copyMultiSegmentsToBytes(MemorySegment[] segments, int offset, byte[] bytes,
			int bytesOffset, int numBytes) {
		int remainSize = numBytes;
		for (MemorySegment segment : segments) {
			int remain = segment.size() - offset;
			if (remain > 0) {
				int nCopy = Math.min(remain, remainSize);
				segment.get(offset, bytes, numBytes - remainSize + bytesOffset, nCopy);
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