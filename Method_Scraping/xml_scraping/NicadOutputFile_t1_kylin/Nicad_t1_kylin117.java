// clone pairs:688:83%
// 1127:kylin/core-metadata/src/main/java/org/apache/kylin/measure/hllc/HLLCounter.java

public class Nicad_t1_kylin117
{
    public static int readUnsigned(ByteBuffer in, int size) {
        int integer = 0;
        int mask = 0xff;
        int shift = 0;
        for (int i = 0; i < size; i++) {
            integer |= (in.get() << shift) & mask;
            mask = mask << 8;
            shift += 8;
        }
        return integer;
    }
}