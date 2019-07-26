// clone pairs:6791:86%
// 6928:flink/flink-libraries/flink-gelly/src/main/java/org/apache/flink/graph/types/valuearray/ByteValueArrayComparator.java

public class Nicad_t2_flink239
{
	public int compareSerialized(DataInputView firstSource, DataInputView secondSource) throws IOException {
		int firstCount = firstSource.readInt();
		int secondCount = secondSource.readInt();

		int minCount = Math.min(firstCount, secondCount);
		while (minCount-- > 0) {
			byte firstValue = firstSource.readByte();
			byte secondValue = secondSource.readByte();

			int cmp = Byte.compare(firstValue, secondValue);
			if (cmp != 0) {
				return ascendingComparison ? cmp : -cmp;
			}
		}

		int cmp = Integer.compare(firstCount, secondCount);
		return ascendingComparison ? cmp : -cmp;
	}
}