// clone pairs:1024:91%
// 478:kafka/clients/src/main/java/org/apache/kafka/common/utils/ByteUtils.java

public class Nicad_t2_kafka_91_9511
{
    public static int readVarint(ByteBuffer buffer) {
        int value = 0;
        int i = 0;
        int b;
        while (((b = buffer.get()) & 0x80) != 0) {
            value |= (b & 0x7f) << i;
            i += 7;
            if (i > 28)
                throw illegalVarintException(value);
        }
        value |= b << i;
        return (value >>> 1) ^ -(value & 1);
    }
}