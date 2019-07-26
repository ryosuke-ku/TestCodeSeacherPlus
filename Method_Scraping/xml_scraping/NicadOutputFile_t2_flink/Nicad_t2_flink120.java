// clone pairs:5445:78%
// 5848:flink/flink-connectors/flink-orc/src/main/java/org/apache/flink/orc/OrcBatchReader.java

public class Nicad_t2_flink120
{
	private static void readNonNullBytesColumnAsString(Object[] vals, int fieldIdx, BytesColumnVector bytes, int childCount) {
		if (bytes.isRepeating) { // fill complete column with first value
			String repeatingValue = readString(bytes.vector[0], bytes.start[0], bytes.length[0]);
			fillColumnWithRepeatingValue(vals, fieldIdx, repeatingValue, childCount);
		} else {
			if (fieldIdx == -1) { // set as an object
				for (int i = 0; i < childCount; i++) {
					vals[i] = readString(bytes.vector[i], bytes.start[i], bytes.length[i]);
				}
			} else { // set as a field of Row
				Row[] rows = (Row[]) vals;
				for (int i = 0; i < childCount; i++) {
					rows[i].setField(fieldIdx, readString(bytes.vector[i], bytes.start[i], bytes.length[i]));
				}
			}
		}
	}
}