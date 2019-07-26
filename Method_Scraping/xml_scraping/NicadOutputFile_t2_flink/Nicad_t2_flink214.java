// clone pairs:6712:86%
// 6792:flink/flink-libraries/flink-gelly/src/main/java/org/apache/flink/graph/types/valuearray/DoubleValueArrayComparator.java

public class Nicad_t2_flink214
{
	public int compareSerialized(DataInputView firstSource, DataInputView secondSource) throws IOException {
		int firstCount = firstSource.readInt();
		int secondCount = secondSource.readInt();

		int minCount = Math.min(firstCount, secondCount);
		while (minCount-- > 0) {
			double firstValue = firstSource.readDouble();
			double secondValue = secondSource.readDouble();

			int cmp = Double.compare(firstValue, secondValue);
			if (cmp != 0) {
				return ascendingComparison ? cmp : -cmp;
			}
		}

		int cmp = Integer.compare(firstCount, secondCount);
		return ascendingComparison ? cmp : -cmp;
	}
}