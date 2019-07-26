// clone pairs:3259:88%
// 4875:flink/flink-runtime/src/main/java/org/apache/flink/runtime/state/IncrementalRemoteKeyedStateHandle.java

public class Nicad_t1_flink_new231
{
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		IncrementalRemoteKeyedStateHandle that = (IncrementalRemoteKeyedStateHandle) o;

		if (getCheckpointId() != that.getCheckpointId()) {
			return false;
		}
		if (!getBackendIdentifier().equals(that.getBackendIdentifier())) {
			return false;
		}
		if (!getKeyGroupRange().equals(that.getKeyGroupRange())) {
			return false;
		}
		if (!getSharedState().equals(that.getSharedState())) {
			return false;
		}
		if (!getPrivateState().equals(that.getPrivateState())) {
			return false;
		}
		return getMetaStateHandle().equals(that.getMetaStateHandle());
	}
}