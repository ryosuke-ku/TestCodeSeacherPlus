// clone pairs:10701:81%
// 11708:flink/flink-core/src/main/java/org/apache/flink/api/common/typeutils/base/array/IntPrimitiveArrayComparator.java

public class Nicad_t2_flink564
{
	public int compare(int[] first, int[] second) {
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