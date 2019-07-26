// clone pairs:17752:90%
// 24218:flink/flink-runtime/src/main/java/org/apache/flink/runtime/state/KeyGroupRange.java

public class Nicad_t1_flink_new22929
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