// clone pairs:12579:70%
// 14868:flink/flink-core/src/main/java/org/apache/flink/api/java/typeutils/ListTypeInfo.java

public class Nicad_t2_flink705
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