// clone pairs:9749:75%
// 10651:flink/flink-table/flink-table-runtime-blink/src/main/java/org/apache/flink/table/runtime/sort/SortUtil.java

public class Nicad_t2_flink387
{
	public static void putStringNormalizedKey(
			BinaryString value, MemorySegment target, int offset, int numBytes) {
		final int limit = offset + numBytes;
		final int end = value.getSizeInBytes();
		for (int i = 0; i < end && offset < limit; i++) {
			target.put(offset++, value.getByte(i));
		}

		for (int i = offset; i < limit; i++) {
			target.put(i, (byte) 0);
		}
	}
}