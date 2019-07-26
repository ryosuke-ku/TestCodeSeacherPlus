// clone pairs:5669:72%
// 6022:flink/flink-runtime/src/main/java/org/apache/flink/runtime/state/OperatorStreamStateHandle.java

public class Nicad_t2_flink142
{
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}

		if (!(o instanceof OperatorStreamStateHandle)) {
			return false;
		}

		OperatorStreamStateHandle that = (OperatorStreamStateHandle) o;

		if (stateNameToPartitionOffsets.size() != that.stateNameToPartitionOffsets.size()) {
			return false;
		}

		for (Map.Entry<String, StateMetaInfo> entry : stateNameToPartitionOffsets.entrySet()) {
			if (!entry.getValue().equals(that.stateNameToPartitionOffsets.get(entry.getKey()))) {
				return false;
			}
		}

		return delegateStateHandle.equals(that.delegateStateHandle);
	}
}