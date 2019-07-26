// clone pairs:13412:70%
// 15994:flink/flink-table/flink-table-runtime-blink/src/main/java/org/apache/flink/table/util/SegmentsUtil.java

public class Nicad_t2_flink734
{
	private static void setLongMultiSegments(MemorySegment[] segments, int offset, long value) {
		int segSize = segments[0].size();
		int segIndex = offset / segSize;
		int segOffset = offset - segIndex * segSize; // equal to %

		if (segOffset < segSize - 7) {
			segments[segIndex].putLong(segOffset, value);
		} else {
			setLongSlowly(segments, segSize, segIndex, segOffset, value);
		}
	}
}