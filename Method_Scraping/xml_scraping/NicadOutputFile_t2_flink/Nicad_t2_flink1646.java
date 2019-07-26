// clone pairs:23992:80%
// 36211:flink/flink-runtime/src/main/java/org/apache/flink/runtime/state/KeyGroupRange.java

public class Nicad_t2_flink1646
{
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof KeyGroupRange)) {
			return false;
		}

		KeyGroupRange that = (KeyGroupRange) o;
		return startKeyGroup == that.startKeyGroup && endKeyGroup == that.endKeyGroup;
	}
}