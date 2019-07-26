// clone pairs:10674:81%
// 11661:flink/flink-core/src/main/java/org/apache/flink/api/common/typeutils/base/array/ShortPrimitiveArrayComparator.java

public class Nicad_t2_flink545
{
	public int compare(short[] first, short[] second) {
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