// clone pairs:9142:83%
// 10294:flink/flink-queryable-state/flink-queryable-state-client-java/src/main/java/org/apache/flink/queryablestate/network/messages/MessageSerializer.java

public class Nicad_t2_flink370
{
	public static ByteBuf serializeRequestFailure(
			final ByteBufAllocator alloc,
			final long requestId,
			final Throwable cause) throws IOException {

		final ByteBuf buf = alloc.ioBuffer();

		// Frame length is set at the end
		buf.writeInt(0);
		writeHeader(buf, MessageType.REQUEST_FAILURE);
		buf.writeLong(requestId);

		try (ByteBufOutputStream bbos = new ByteBufOutputStream(buf);
				ObjectOutput out = new ObjectOutputStream(bbos)) {
			out.writeObject(cause);
		}

		// Set frame length
		int frameLength = buf.readableBytes() - Integer.BYTES;
		buf.setInt(0, frameLength);
		return buf;
	}
}