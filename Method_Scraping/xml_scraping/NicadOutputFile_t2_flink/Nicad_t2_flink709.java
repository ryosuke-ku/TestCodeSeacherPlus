// clone pairs:12589:70%
// 14888:flink/flink-core/src/main/java/org/apache/flink/api/java/typeutils/MultisetTypeInfo.java

public class Nicad_t2_flink709
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