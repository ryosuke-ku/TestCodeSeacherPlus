// clone pairs:5573:73%
// 5969:flink/flink-table/flink-table-runtime-blink/src/main/java/org/apache/flink/table/util/SegmentsUtil.java

public class Nicad_t2_flink138
{
	private static long getLongSlowly(
			MemorySegment[] segments, int segSize, int segNum, int segOffset) {
		MemorySegment segment = segments[segNum];
		long ret = 0;
		for (int i = 0; i < 8; i++) {
			if (segOffset == segSize) {
				segment = segments[++segNum];
				segOffset = 0;
			}
			long unsignedByte = segment.get(segOffset) & 0xff;
			if (LITTLE_ENDIAN) {
				ret |= (unsignedByte << (i * 8));
			} else {
				ret |= (unsignedByte << ((7 - i) * 8));
			}
			segOffset++;
		}
		return ret;
	}
}