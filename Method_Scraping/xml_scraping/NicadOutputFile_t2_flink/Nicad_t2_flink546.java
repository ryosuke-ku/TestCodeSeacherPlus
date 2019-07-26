// clone pairs:10675:90%
// 11663:flink/flink-core/src/main/java/org/apache/flink/api/common/typeutils/base/array/CharPrimitiveArrayComparator.java

public class Nicad_t2_flink546
{
	public int compare(char[] first, char[] second) {
		for (int x = 0; x < min(first.length, second.length); x++) {
			int cmp = first[x] - second[x];
			if (cmp != 0) {
				return ascending ? cmp : -cmp;
			}
		}
		int cmp = first.length - second.length;
		return ascending ? cmp : -cmp;
	}
}