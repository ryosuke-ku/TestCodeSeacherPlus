// clone pairs:26:72%
// 12:beam/runners/google-cloud-dataflow-java/worker/src/main/java/org/apache/beam/runners/dataflow/worker/OrderedCode.java

public class Nicad_t1_beam_2nd3
{
  public void writeBytes(byte[] value) {
    // Determine the length of the encoded array
    int encodedLength = 2; // for separator
    for (byte b : value) {
      if ((b == ESCAPE1) || (b == ESCAPE2)) {
        encodedLength += 2;
      } else {
        encodedLength++;
      }
    }

    byte[] encodedArray = new byte[encodedLength];
    int copyStart = 0;
    int outIndex = 0;
    for (int i = 0; i < value.length; i++) {
      byte b = value[i];
      if (b == ESCAPE1) {
        System.arraycopy(value, copyStart, encodedArray, outIndex, i - copyStart);
        outIndex += i - copyStart;
        encodedArray[outIndex++] = ESCAPE1;
        encodedArray[outIndex++] = NULL_CHARACTER;
        copyStart = i + 1;
      } else if (b == ESCAPE2) {
        System.arraycopy(value, copyStart, encodedArray, outIndex, i - copyStart);
        outIndex += i - copyStart;
        encodedArray[outIndex++] = ESCAPE2;
        encodedArray[outIndex++] = FF_CHARACTER;
        copyStart = i + 1;
      }
    }
    if (copyStart < value.length) {
      System.arraycopy(value, copyStart, encodedArray, outIndex, value.length - copyStart);
      outIndex += value.length - copyStart;
    }
    encodedArray[outIndex++] = ESCAPE1;
    encodedArray[outIndex] = SEPARATOR;

    encodedArrays.add(encodedArray);
  }
}