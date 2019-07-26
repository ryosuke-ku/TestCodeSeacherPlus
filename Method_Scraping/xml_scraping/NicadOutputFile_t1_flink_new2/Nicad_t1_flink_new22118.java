// clone pairs:15777:80%
// 20506:flink/flink-streaming-java/src/main/java/org/apache/flink/streaming/runtime/operators/windowing/WindowOperator.java

public class Nicad_t1_flink_new22118
{
		public boolean equals(Object o) {
			if (this == o) {
				return true;
			}
			if (o == null || getClass() != o.getClass()){
				return false;
			}

			Timer<?, ?> timer = (Timer<?, ?>) o;

			return timestamp == timer.timestamp
				&& key.equals(timer.key)
				&& window.equals(timer.window);

		}
}