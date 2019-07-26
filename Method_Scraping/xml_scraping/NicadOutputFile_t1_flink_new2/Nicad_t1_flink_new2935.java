// clone pairs:12000:80%
// 14012:flink/flink-core/src/main/java/org/apache/flink/api/java/typeutils/ListTypeInfo.java

public class Nicad_t1_flink_new2935
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