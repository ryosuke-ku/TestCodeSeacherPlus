// clone pairs:13413:80%
// 15996:flink/flink-table/flink-table-runtime-blink/src/main/java/org/apache/flink/table/util/SegmentsUtil.java

public class Nicad_t2_flink735
{
	private static long getLongMultiSegments(MemorySegment[] segments, int offset) {
		int segSize = segments[0].size();
		int segIndex = offset / segSize;
		int segOffset = offset - segIndex * segSize; // equal to %

		if (segOffset < segSize - 7) {
			return segments[segIndex].getLong(segOffset);
		} else {
			return getLongSlowly(segments, segSize, segIndex, segOffset);
		}
	}
}