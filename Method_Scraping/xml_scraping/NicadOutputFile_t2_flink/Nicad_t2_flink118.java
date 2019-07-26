// clone pairs:5443:78%
// 5844:flink/flink-connectors/flink-orc/src/main/java/org/apache/flink/orc/OrcBatchReader.java

public class Nicad_t2_flink118
{
	private static <T> void readNonNullDoubleColumn(Object[] vals, int fieldIdx, DoubleColumnVector vector,
													int childCount, DoubleFunction<T> reader) {

		if (vector.isRepeating) { // fill complete column with first value
			T repeatingValue = reader.apply(vector.vector[0]);
			fillColumnWithRepeatingValue(vals, fieldIdx, repeatingValue, childCount);
		} else {
			if (fieldIdx == -1) { // set as an object
				for (int i = 0; i < childCount; i++) {
					vals[i] = reader.apply(vector.vector[i]);
				}
			} else { // set as a field of Row
				Row[] rows = (Row[]) vals;
				for (int i = 0; i < childCount; i++) {
					rows[i].setField(fieldIdx, reader.apply(vector.vector[i]));
				}
			}
		}
	}
}