// clone pairs:12585:70%
// 14880:flink/flink-core/src/main/java/org/apache/flink/api/java/typeutils/ListTypeInfo.java

public class Nicad_t2_flink706
{
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		else if (obj instanceof ListTypeInfo) {
			final ListTypeInfo<?> other = (ListTypeInfo<?>) obj;
			return other.canEqual(this) && elementTypeInfo.equals(other.elementTypeInfo);
		} else {
			return false;
		}
	}
}