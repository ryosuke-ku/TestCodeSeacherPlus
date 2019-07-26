// clone pairs:6792:86%
// 6930:flink/flink-libraries/flink-gelly/src/main/java/org/apache/flink/graph/types/valuearray/ShortValueArrayComparator.java

public class Nicad_t2_flink240
{
	public int compareSerialized(DataInputView firstSource, DataInputView secondSource) throws IOException {
		int firstCount = firstSource.readInt();
		int secondCount = secondSource.readInt();

		int minCount = Math.min(firstCount, secondCount);
		while (minCount-- > 0) {
			short firstValue = firstSource.readShort();
			short secondValue = secondSource.readShort();

			int cmp = Short.compare(firstValue, secondValue);
			if (cmp != 0) {
				return ascendingComparison ? cmp : -cmp;
			}
		}

		int cmp = Integer.compare(firstCount, secondCount);
		return ascendingComparison ? cmp : -cmp;
	}
}