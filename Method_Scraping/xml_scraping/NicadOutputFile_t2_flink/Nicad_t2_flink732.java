// clone pairs:13410:80%
// 15990:flink/flink-table/flink-table-runtime-blink/src/main/java/org/apache/flink/table/util/SegmentsUtil.java

public class Nicad_t2_flink732
{
	private static float getFloatMultiSegments(MemorySegment[] segments, int offset) {
		int segSize = segments[0].size();
		int segIndex = offset / segSize;
		int segOffset = offset - segIndex * segSize; // equal to %

		if (segOffset < segSize - 3) {
			return segments[segIndex].getFloat(segOffset);
		} else {
			return Float.intBitsToFloat(getIntSlowly(segments, segSize, segIndex, segOffset));
		}
	}
}