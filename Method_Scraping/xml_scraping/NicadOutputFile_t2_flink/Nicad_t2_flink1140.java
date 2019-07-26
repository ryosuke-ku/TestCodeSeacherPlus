// clone pairs:21079:80%
// 30846:flink/flink-streaming-java/src/main/java/org/apache/flink/streaming/api/windowing/windows/TimeWindow.java

public class Nicad_t2_flink1140
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