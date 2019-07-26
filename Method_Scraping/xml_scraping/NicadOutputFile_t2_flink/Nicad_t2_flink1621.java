// clone pairs:23964:80%
// 36155:flink/flink-runtime/src/main/java/org/apache/flink/runtime/state/KeyGroupRange.java

public class Nicad_t2_flink1621
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