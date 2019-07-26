// clone pairs:10120:72%
// 11035:flink/flink-runtime/src/main/java/org/apache/flink/runtime/checkpoint/savepoint/SavepointV2Serializer.java

public class Nicad_t1_flink_new2438
{
	private static Map<StateHandleID, StreamStateHandle> deserializeStreamStateHandleMap(
		DataInputStream dis) throws IOException {

		final int size = dis.readInt();
		Map<StateHandleID, StreamStateHandle> result = new HashMap<>(size);

		for (int i = 0; i < size; ++i) {
			StateHandleID stateHandleID = new StateHandleID(dis.readUTF());
			StreamStateHandle stateHandle = deserializeStreamStateHandle(dis);
			result.put(stateHandleID, stateHandle);
		}

		return result;
	}
}