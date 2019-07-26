// clone pairs:13405:80%
// 15980:flink/flink-table/flink-table-runtime-blink/src/main/java/org/apache/flink/table/util/SegmentsUtil.java

public class Nicad_t2_flink727
{
	private static void setFloatMultiSegments(MemorySegment[] segments, int offset, float value) {
		int segSize = segments[0].size();
		int segIndex = offset / segSize;
		int segOffset = offset - segIndex * segSize; // equal to %

		if (segOffset < segSize - 3) {
			segments[segIndex].putFloat(segOffset, value);
		} else {
			setIntSlowly(segments, segSize, segIndex, segOffset, Float.floatToRawIntBits(value));
		}
	}
}