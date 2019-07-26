// clone pairs:1020:100%
// 825:beam/runners/google-cloud-dataflow-java/worker/src/main/java/org/apache/beam/runners/dataflow/worker/OrderedCode.java

public class Nicad_t1_beam45
{
  public void writeNumIncreasing(long value) {
    // Values are encoded with a single byte length prefix, followed
    // by the actual value in big-endian format with leading 0 bytes
    // dropped.
    byte[] bufer = new byte[9]; // 8 bytes for value plus one byte for length
    int len = 0;
    while (value != 0) {
      len++;
      bufer[9 - len] = (byte) (value & 0xff);
      value >>>= 8;
    }
    bufer[9 - len - 1] = (byte) len;
    len++;
    byte[] encodedArray = new byte[len];
    System.arraycopy(bufer, 9 - len, encodedArray, 0, len);
    encodedArrays.add(encodedArray);
  }
}