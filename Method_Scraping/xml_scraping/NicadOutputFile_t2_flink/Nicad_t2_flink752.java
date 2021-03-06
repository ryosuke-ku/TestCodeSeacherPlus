// clone pairs:13430:80%
// 16030:flink/flink-table/flink-table-runtime-blink/src/main/java/org/apache/flink/table/util/SegmentsUtil.java

public class Nicad_t2_flink752
{
	private static void setIntMultiSegments(MemorySegment[] segments, int offset, int value) {
		int segSize = segments[0].size();
		int segIndex = offset / segSize;
		int segOffset = offset - segIndex * segSize; // equal to %

		if (segOffset < segSize - 3) {
			segments[segIndex].putInt(segOffset, value);
		} else {
			setIntSlowly(segments, segSize, segIndex, segOffset, value);
		}
	}
}