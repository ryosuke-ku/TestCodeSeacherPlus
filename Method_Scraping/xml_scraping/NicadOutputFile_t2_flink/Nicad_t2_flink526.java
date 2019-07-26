// clone pairs:10559:72%
// 11481:flink/flink-core/src/main/java/org/apache/flink/api/java/typeutils/MapTypeInfo.java

public class Nicad_t2_flink526
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