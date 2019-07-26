// clone pairs:78:97%
// 13:kafka/clients/src/main/java/org/apache/kafka/common/utils/Crc32.java

public class Nicad_t1_kafka_1001
{
    public void update(byte[] b, int off, int len) {
        if (off < 0 || len < 0 || off > b.length - len)
            throw new ArrayIndexOutOfBoundsException();

        int localCrc = crc;

        while (len > 7) {
            final int c0 = (b[off + 0] ^ localCrc) & 0xff;
            final int c1 = (b[off + 1] ^ (localCrc >>>= 8)) & 0xff;
            final int c2 = (b[off + 2] ^ (localCrc >>>= 8)) & 0xff;
            final int c3 = (b[off + 3] ^ (localCrc >>>= 8)) & 0xff;
            localCrc = (T[T8_7_START + c0] ^ T[T8_6_START + c1]) ^ (T[T8_5_START + c2] ^ T[T8_4_START + c3]);

            final int c4 = b[off + 4] & 0xff;
            final int c5 = b[off + 5] & 0xff;
            final int c6 = b[off + 6] & 0xff;
            final int c7 = b[off + 7] & 0xff;

            localCrc ^= (T[T8_3_START + c4] ^ T[T8_2_START + c5]) ^ (T[T8_1_START + c6] ^ T[T8_0_START + c7]);

            off += 8;
            len -= 8;
        }

        /* loop unroll - duff's device style */
        switch (len) {
            case 7:
                localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
            case 6:
                localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
            case 5:
                localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
            case 4:
                localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
            case 3:
                localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
            case 2:
                localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
            case 1:
                localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
            default:
                /* nothing */
        }

        // Publish crc out to object
        crc = localCrc;
    }
}