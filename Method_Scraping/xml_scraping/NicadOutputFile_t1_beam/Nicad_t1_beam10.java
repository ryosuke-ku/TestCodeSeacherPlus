// clone pairs:333:100%
// 178:beam/runners/google-cloud-dataflow-java/worker/src/main/java/org/apache/beam/runners/dataflow/worker/OrderedCode.java

public class Nicad_t1_beam10
{
  public void writeSignedNumIncreasing(long val) {
    long x = val < 0 ? ~val : val;
    if (x < 64) { // Fast path for encoding length == 1.
      byte[] encodedArray = new byte[] {(byte) (LENGTH_TO_HEADER_BITS[1][0] ^ val)};
      encodedArrays.add(encodedArray);
      return;
    }
    // buf = val in network byte order, sign extended to 10 bytes.
    byte signByte = val < 0 ? (byte) 0xff : 0;
    byte[] buf = new byte[2 + Longs.BYTES];
    buf[0] = buf[1] = signByte;
    System.arraycopy(Longs.toByteArray(val), 0, buf, 2, Longs.BYTES);
    int len = getSignedEncodingLength(x);
    if (len < 2) {
      throw new IllegalStateException(
          "Invalid length (" + len + ")" + " returned by getSignedEncodingLength(" + x + ")");
    }
    int beginIndex = buf.length - len;
    buf[beginIndex] ^= LENGTH_TO_HEADER_BITS[len][0];
    buf[beginIndex + 1] ^= LENGTH_TO_HEADER_BITS[len][1];

    byte[] encodedArray = new byte[len];
    System.arraycopy(buf, beginIndex, encodedArray, 0, len);
    encodedArrays.add(encodedArray);
  }
}