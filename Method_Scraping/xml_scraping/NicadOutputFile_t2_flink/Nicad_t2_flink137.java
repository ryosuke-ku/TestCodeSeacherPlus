// clone pairs:5559:89%
// 5961:flink/flink-table/flink-table-runtime-blink/src/main/java/org/apache/flink/table/util/SegmentsUtil.java

public class Nicad_t2_flink137
{
	private static int getIntSlowly(
			MemorySegment[] segments, int segSize, int segNum, int segOffset) {
		MemorySegment segment = segments[segNum];
		int ret = 0;
		for (int i = 0; i < 4; i++) {
			if (segOffset == segSize) {
				segment = segments[++segNum];
				segOffset = 0;
			}
			int unsignedByte = segment.get(segOffset) & 0xff;
			if (LITTLE_ENDIAN) {
				ret |= (unsignedByte << (i * 8));
			} else {
				ret |= (unsignedByte << ((3 - i) * 8));
			}
			segOffset++;
		}
		return ret;
	}
}