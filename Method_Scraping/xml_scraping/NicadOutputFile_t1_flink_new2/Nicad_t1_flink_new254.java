// clone pairs:5620:72%
// 5978:flink/flink-core/src/main/java/org/apache/flink/api/java/typeutils/runtime/RowComparator.java

public class Nicad_t1_flink_new254
{
	public int compare(Row first, Row second) {
		int i = 0;
		try {
			for (; i < keyPositions.length; i++) {
				int keyPos = keyPositions[i];
				TypeComparator<Object> comparator = comparators[i];
				Object firstElement = first.getField(keyPos);   // element can be null
				Object secondElement = second.getField(keyPos); // element can be null

				int cmp = comparator.compare(firstElement, secondElement);
				if (cmp != 0) {
					return cmp;
				}
			}
		} catch (IndexOutOfBoundsException e) {
			throw new KeyFieldOutOfBoundsException(keyPositions[i]);
		}
		return 0;
	}
}