// clone pairs:6282:70%
// 6401:flink/flink-core/src/main/java/org/apache/flink/api/java/tuple/Tuple2.java

public class Nicad_t1_flink_new280
{
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof Tuple2)) {
			return false;
		}
		@SuppressWarnings("rawtypes")
		Tuple2 tuple = (Tuple2) o;
		if (f0 != null ? !f0.equals(tuple.f0) : tuple.f0 != null) {
			return false;
		}
		if (f1 != null ? !f1.equals(tuple.f1) : tuple.f1 != null) {
			return false;
		}
		return true;
	}
}