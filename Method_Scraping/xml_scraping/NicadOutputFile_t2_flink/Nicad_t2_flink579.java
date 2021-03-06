// clone pairs:10717:81%
// 11740:flink/flink-core/src/main/java/org/apache/flink/api/common/typeutils/base/array/BytePrimitiveArrayComparator.java

public class Nicad_t2_flink579
{
	public int compare(byte[] first, byte[] second) {
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