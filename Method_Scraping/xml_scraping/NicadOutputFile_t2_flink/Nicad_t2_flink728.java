// clone pairs:13406:70%
// 15982:flink/flink-table/flink-table-runtime-blink/src/main/java/org/apache/flink/table/util/SegmentsUtil.java

public class Nicad_t2_flink728
{
	private static void setShortMultiSegments(MemorySegment[] segments, int offset, short value) {
		int segSize = segments[0].size();
		int segIndex = offset / segSize;
		int segOffset = offset - segIndex * segSize; // equal to %

		if (segOffset < segSize - 1) {
			segments[segIndex].putShort(segOffset, value);
		} else {
			setTwoByteSlowly(segments, segSize, segIndex, segOffset, value, value >> 8);
		}
	}
}