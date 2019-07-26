// clone pairs:10554:72%
// 11471:flink/flink-core/src/main/java/org/apache/flink/api/java/typeutils/MapTypeInfo.java

public class Nicad_t2_flink525
{
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		} else if (obj instanceof MapTypeInfo) {
			@SuppressWarnings("unchecked")
			MapTypeInfo<K, V> other = (MapTypeInfo<K, V>) obj;
			
			return (other.canEqual(this) && 
					keyTypeInfo.equals(other.keyTypeInfo) && valueTypeInfo.equals(other.valueTypeInfo));
		} else {
			return false;
		}
	}
}