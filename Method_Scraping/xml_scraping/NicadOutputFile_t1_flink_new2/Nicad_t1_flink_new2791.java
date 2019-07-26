// clone pairs:11568:70%
// 13189:flink/flink-core/src/main/java/org/apache/flink/api/java/typeutils/MultisetTypeInfo.java

public class Nicad_t1_flink_new2791
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