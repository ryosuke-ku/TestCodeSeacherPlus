// clone pairs:1023:91%
// 476:kafka/clients/src/main/java/org/apache/kafka/common/utils/ByteUtils.java

public class Nicad_t2_kafka_91_9510
{
    public static long readVarlong(DataInput in) throws IOException {
        long value = 0L;
        int i = 0;
        long b;
        while (((b = in.readByte()) & 0x80) != 0) {
            value |= (b & 0x7f) << i;
            i += 7;
            if (i > 63)
                throw illegalVarlongException(value);
        }
        value |= b << i;
        return (value >>> 1) ^ -(value & 1);
    }
}