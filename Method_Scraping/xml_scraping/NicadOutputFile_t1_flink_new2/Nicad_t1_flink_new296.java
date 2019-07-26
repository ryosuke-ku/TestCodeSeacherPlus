// clone pairs:6537:81%
// 6618:flink/flink-table/flink-table-runtime-blink/src/main/java/org/apache/flink/table/runtime/join/SortMergeJoinIterator.java

public class Nicad_t1_flink_new296
{
	public SortMergeJoinIterator(
			BinaryRowSerializer probeSerializer,
			BinaryRowSerializer bufferedSerializer,
			Projection<BaseRow, BinaryRow> probeProjection,
			Projection<BaseRow, BinaryRow> bufferedProjection,
			RecordComparator keyComparator,
			MutableObjectIterator<BaseRow> probeIterator,
			MutableObjectIterator<BinaryRow> bufferedIterator,
			ResettableExternalBuffer buffer,
			boolean[] filterNulls) throws IOException {
		this.probeProjection = probeProjection;
		this.bufferedProjection = bufferedProjection;
		this.keyComparator = keyComparator;
		this.probeIterator = probeIterator;
		this.bufferedIterator = bufferedIterator;

		this.probeRow = probeSerializer.createInstance();
		this.bufferedRow = bufferedSerializer.createInstance();
		this.matchBuffer = buffer;
		this.nullFilterKeys = NullAwareJoinHelper.getNullFilterKeys(filterNulls);
		this.nullSafe = nullFilterKeys.length == 0;
		this.filterAllNulls = nullFilterKeys.length == filterNulls.length;

		advanceNextSuitableBufferedRow(); // advance first buffered row to compare with probe key.
	}
}