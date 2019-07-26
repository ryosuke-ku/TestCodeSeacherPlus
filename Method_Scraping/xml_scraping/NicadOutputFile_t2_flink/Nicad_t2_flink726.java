// clone pairs:13404:70%
// 15978:flink/flink-table/flink-table-runtime-blink/src/main/java/org/apache/flink/table/util/SegmentsUtil.java

public class Nicad_t2_flink726
{
	private static double getDoubleMultiSegments(MemorySegment[] segments, int offset) {
		int segSize = segments[0].size();
		int segIndex = offset / segSize;
		int segOffset = offset - segIndex * segSize; // equal to %

		if (segOffset < segSize - 7) {
			return segments[segIndex].getDouble(segOffset);
		} else {
			return Double.longBitsToDouble(getLongSlowly(segments, segSize, segIndex, segOffset));
		}
	}
}