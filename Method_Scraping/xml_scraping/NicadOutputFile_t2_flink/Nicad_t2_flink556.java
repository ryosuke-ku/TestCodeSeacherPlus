// clone pairs:10689:81%
// 11691:flink/flink-core/src/main/java/org/apache/flink/api/common/typeutils/base/array/LongPrimitiveArrayComparator.java

public class Nicad_t2_flink556
{
	public int compare(long[] first, long[] second) {
		for (int x = 0; x < min(first.length, second.length); x++) {
			int cmp = first[x] < second[x] ? -1 : (first[x] == second[x] ? 0 : 1);
			if (cmp != 0) {
				return ascending ? cmp : -cmp;
			}
		}
		int cmp = first.length - second.length;
		return ascending ? cmp : -cmp;
	}
}