// clone pairs:16115:80%
// 21299:flink/flink-runtime/src/main/java/org/apache/flink/runtime/state/KeyGroupRange.java

public class Nicad_t2_flink955
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