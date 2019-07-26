// clone pairs:13431:80%
// 16032:flink/flink-table/flink-table-runtime-blink/src/main/java/org/apache/flink/table/util/SegmentsUtil.java

public class Nicad_t2_flink753
{
	private static int getIntMultiSegments(MemorySegment[] segments, int offset) {
		int segSize = segments[0].size();
		int segIndex = offset / segSize;
		int segOffset = offset - segIndex * segSize; // equal to %

		if (segOffset < segSize - 3) {
			return segments[segIndex].getInt(segOffset);
		} else {
			return getIntSlowly(segments, segSize, segIndex, segOffset);
		}
	}
}