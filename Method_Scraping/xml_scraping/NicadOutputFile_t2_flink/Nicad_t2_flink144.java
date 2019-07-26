// clone pairs:5671:94%
// 6026:flink/flink-runtime/src/main/java/org/apache/flink/runtime/checkpoint/savepoint/SavepointV1Serializer.java

public class Nicad_t2_flink144
{
	public static StreamStateHandle deserializeStreamStateHandle(DataInputStream dis) throws IOException {
		int type = dis.read();
		if (NULL_HANDLE == type) {
			return null;
		} else if (FILE_STREAM_STATE_HANDLE == type) {
			long size = dis.readLong();
			String pathString = dis.readUTF();
			return new FileStateHandle(new Path(pathString), size);
		} else if (BYTE_STREAM_STATE_HANDLE == type) {
			String handleName = dis.readUTF();
			int numBytes = dis.readInt();
			byte[] data = new byte[numBytes];
			dis.readFully(data);
			return new ByteStreamStateHandle(handleName, data);
		} else {
			throw new IOException("Unknown implementation of StreamStateHandle, code: " + type);
		}
	}
}