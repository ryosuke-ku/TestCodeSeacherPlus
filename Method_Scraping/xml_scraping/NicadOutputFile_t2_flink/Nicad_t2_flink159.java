// clone pairs:5808:77%
// 6152:flink/flink-table/flink-table-runtime-blink/src/main/java/org/apache/flink/table/util/SegmentsUtil.java

public class Nicad_t2_flink159
{
	private static void setIntSlowly(
			MemorySegment[] segments, int segSize, int segNum, int segOffset, int value) {
		MemorySegment segment = segments[segNum];
		for (int i = 0; i < 4; i++) {
			if (segOffset == segSize) {
				segment = segments[++segNum];
				segOffset = 0;
			}
			int unsignedByte;
			if (LITTLE_ENDIAN) {
				unsignedByte = value >> (i * 8);
			} else {
				unsignedByte = value >> ((3 - i) * 8);
			}
			segment.put(segOffset, (byte) unsignedByte);
			segOffset++;
		}
	}
}