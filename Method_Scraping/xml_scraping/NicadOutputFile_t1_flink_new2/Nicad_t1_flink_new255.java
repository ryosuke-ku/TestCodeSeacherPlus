// clone pairs:5637:77%
// 5979:flink/flink-core/src/main/java/org/apache/flink/api/java/typeutils/runtime/PojoComparator.java

public class Nicad_t1_flink_new255
{
	public int compareToReference(TypeComparator<T> referencedComparator) {
		PojoComparator<T> other = (PojoComparator<T>) referencedComparator;

		int i = 0;
		try {
			for (; i < this.keyFields.length; i++) {
				int cmp = this.comparators[i].compareToReference(other.comparators[i]);
				if (cmp != 0) {
					return cmp;
				}
			}
			return 0;
		}
		catch (NullPointerException npex) {
			throw new NullKeyFieldException(this.keyFields[i].toString());
		}
	}
}