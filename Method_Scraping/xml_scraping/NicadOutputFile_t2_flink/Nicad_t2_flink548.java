// clone pairs:10677:81%
// 11667:flink/flink-core/src/main/java/org/apache/flink/api/common/typeutils/base/array/BooleanPrimitiveArrayComparator.java

public class Nicad_t2_flink548
{
	public int compare(boolean[] first, boolean[] second) {
		for (int x = 0; x < min(first.length, second.length); x++) {
			int cmp = (second[x] == first[x] ? 0 : (first[x] ? 1 : -1));
			if (cmp != 0) {
				return ascending ? cmp : -cmp;
			}
		}
		int cmp = first.length - second.length;
		return ascending ? cmp : -cmp;
	}
}