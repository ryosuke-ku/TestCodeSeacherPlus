// clone pairs:14649:80%
// 18300:flink/flink-streaming-java/src/main/java/org/apache/flink/streaming/api/operators/TimerSerializer.java

public class Nicad_t1_flink_new21658
{
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		TimerSerializer<?, ?> that = (TimerSerializer<?, ?>) o;
		return Objects.equals(keySerializer, that.keySerializer) &&
			Objects.equals(namespaceSerializer, that.namespaceSerializer);
	}
}