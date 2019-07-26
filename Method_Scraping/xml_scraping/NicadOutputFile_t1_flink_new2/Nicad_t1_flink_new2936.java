// clone pairs:12001:80%
// 14015:flink/flink-core/src/main/java/org/apache/flink/api/java/typeutils/MultisetTypeInfo.java

public class Nicad_t1_flink_new2936
{
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		else if (obj instanceof MultisetTypeInfo) {
			final MultisetTypeInfo<?> other = (MultisetTypeInfo<?>) obj;
			return other.canEqual(this) && getKeyTypeInfo().equals(other.getKeyTypeInfo());
		} else {
			return false;
		}
	}
}