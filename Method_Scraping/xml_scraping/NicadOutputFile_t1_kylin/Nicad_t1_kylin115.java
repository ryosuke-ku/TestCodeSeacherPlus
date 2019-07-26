// clone pairs:686:75%
// 1123:kylin/core-common/src/main/java/org/apache/kylin/common/util/BytesUtil.java

public class Nicad_t1_kylin115
{
    public static long readLong(ByteBuffer in) {
        long integer = 0;
        long mask = 0xff;
        int shift = 0;
        for (int i = 0; i < 8; i++) {
            integer |= (in.get() << shift) & mask;
            mask = mask << 8;
            shift += 8;
        }
        return integer;
    }
}