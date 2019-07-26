// clone pairs:12597:70%
// 14903:flink/flink-core/src/main/java/org/apache/flink/api/java/typeutils/MultisetTypeInfo.java

public class Nicad_t2_flink713
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