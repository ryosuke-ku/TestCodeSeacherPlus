// clone pairs:7763:76%
// 7659:flink/flink-table/flink-table-runtime-blink/src/main/java/org/apache/flink/table/dataformat/BinaryString.java

public class Nicad_t1_flink_new2146
{
	public boolean equals(Object o) {
		if (o != null && o instanceof BinaryString) {
			BinaryString other = (BinaryString) o;
			if (javaObject != null && other.javaObject != null) {
				return javaObject.equals(other.javaObject);
			}

			ensureMaterialized();
			other.ensureMaterialized();
			return binaryEquals(other);
		} else {
			return false;
		}
	}
}