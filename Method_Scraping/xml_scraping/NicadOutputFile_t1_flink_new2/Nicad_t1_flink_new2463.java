// clone pairs:10248:72%
// 11208:flink/flink-runtime/src/main/java/org/apache/flink/runtime/operators/sort/NormalizedKeySorter.java

public class Nicad_t1_flink_new2463
{
	public int compare(int segmentNumberI, int segmentOffsetI, int segmentNumberJ, int segmentOffsetJ) {
		final MemorySegment segI = this.sortIndex.get(segmentNumberI);
		final MemorySegment segJ = this.sortIndex.get(segmentNumberJ);

		int val = segI.compare(segJ, segmentOffsetI + OFFSET_LEN, segmentOffsetJ + OFFSET_LEN, this.numKeyBytes);

		if (val != 0 || this.normalizedKeyFullyDetermines) {
			return this.useNormKeyUninverted ? val : -val;
		}

		final long pointerI = segI.getLong(segmentOffsetI) & POINTER_MASK;
		final long pointerJ = segJ.getLong(segmentOffsetJ) & POINTER_MASK;

		return compareRecords(pointerI, pointerJ);
	}
}