// clone pairs:10873:81%
// 11935:flink/flink-table/flink-table-runtime-blink/src/main/java/org/apache/flink/table/util/SegmentsUtil.java

public class Nicad_t2_flink602
{
	public static void bitUnSet(MemorySegment[] segments, int baseOffset, int index) {
		if (segments.length == 1) {
			MemorySegment segment = segments[0];
			int offset = baseOffset + byteIndex(index);
			byte current = segment.get(offset);
			current &= ~(1 << (index & BIT_BYTE_INDEX_MASK));
			segment.put(offset, current);
		} else {
			bitUnSetMultiSegments(segments, baseOffset, index);
		}
	}
}