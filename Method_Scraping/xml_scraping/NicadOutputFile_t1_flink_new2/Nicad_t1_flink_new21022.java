// clone pairs:12583:80%
// 14779:flink/flink-core/src/main/java/org/apache/flink/api/java/typeutils/ListTypeInfo.java

public class Nicad_t1_flink_new21022
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