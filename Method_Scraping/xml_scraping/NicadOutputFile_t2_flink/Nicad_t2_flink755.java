// clone pairs:13433:90%
// 16036:flink/flink-table/flink-table-runtime-blink/src/main/java/org/apache/flink/table/util/SegmentsUtil.java

public class Nicad_t2_flink755
{
	private static void bitUnSetMultiSegments(MemorySegment[] segments, int baseOffset, int index) {
		int offset = baseOffset + byteIndex(index);
		int segSize = segments[0].size();
		int segIndex = offset / segSize;
		int segOffset = offset - segIndex * segSize; // equal to %
		MemorySegment segment = segments[segIndex];

		byte current = segment.get(segOffset);
		current &= ~(1 << (index & BIT_BYTE_INDEX_MASK));
		segment.put(segOffset, current);
	}
}