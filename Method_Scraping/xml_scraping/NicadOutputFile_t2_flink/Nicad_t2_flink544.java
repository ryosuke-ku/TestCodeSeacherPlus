// clone pairs:10673:81%
// 11659:flink/flink-core/src/main/java/org/apache/flink/api/common/typeutils/base/array/FloatPrimitiveArrayComparator.java

public class Nicad_t2_flink544
{
	public int compare(float[] first, float[] second) {
		for (int x = 0; x < min(first.length, second.length); x++) {
			int cmp = Float.compare(first[x], second[x]);
			if (cmp != 0) {
				return ascending ? cmp : -cmp;
			}
		}
		int cmp = first.length - second.length;
		return ascending ? cmp : -cmp;
	}
}