// clone pairs:13424:70%
// 16018:flink/flink-table/flink-table-runtime-blink/src/main/java/org/apache/flink/table/util/SegmentsUtil.java

public class Nicad_t2_flink746
{
	private static short getShortMultiSegments(MemorySegment[] segments, int offset) {
		int segSize = segments[0].size();
		int segIndex = offset / segSize;
		int segOffset = offset - segIndex * segSize; // equal to %

		if (segOffset < segSize - 1) {
			return segments[segIndex].getShort(segOffset);
		} else {
			return (short) getTwoByteSlowly(segments, segSize, segIndex, segOffset);
		}
	}
}