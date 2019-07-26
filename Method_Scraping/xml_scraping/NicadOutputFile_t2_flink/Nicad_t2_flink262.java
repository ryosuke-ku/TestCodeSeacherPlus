// clone pairs:6980:80%
// 7124:flink/flink-runtime/src/main/java/org/apache/flink/runtime/io/network/buffer/NetworkBuffer.java

public class Nicad_t2_flink262
{
	public ByteBuf getBytes(int index, ByteBuf dst, int dstIndex, int length) {
		// from UnpooledDirectByteBuf:
		checkDstIndex(index, length, dstIndex, dst.capacity());

		if (dst.hasArray()) {
			getBytes(index, dst.array(), dst.arrayOffset() + dstIndex, length);
		} else if (dst.nioBufferCount() > 0) {
			for (ByteBuffer bb: dst.nioBuffers(dstIndex, length)) {
				int bbLen = bb.remaining();
				getBytes(index, bb);
				index += bbLen;
			}
		} else {
			dst.setBytes(dstIndex, this, index, length);
		}
		return this;
	}
}