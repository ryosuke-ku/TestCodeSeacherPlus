// clone pairs:11178:90%
// 12447:flink/flink-streaming-java/src/main/java/org/apache/flink/streaming/api/windowing/windows/TimeWindow.java

public class Nicad_t1_flink_new2603
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