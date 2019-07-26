// clone pairs:21134:90%
// 30667:flink/flink-streaming-java/src/main/java/org/apache/flink/streaming/api/windowing/windows/TimeWindow.java

public class Nicad_t1_flink_new24445
{
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		TimeWindow window = (TimeWindow) o;

		return end == window.end && start == window.start;
	}
}