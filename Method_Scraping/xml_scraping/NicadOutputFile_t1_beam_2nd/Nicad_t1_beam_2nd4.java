// clone pairs:30:100%
// 14:beam/runners/google-cloud-dataflow-java/worker/src/main/java/org/apache/beam/runners/dataflow/worker/OrderedCode.java

public class Nicad_t1_beam_2nd4
{
  public byte[] getEncodedBytes() {
    if (encodedArrays.isEmpty()) {
      return new byte[0];
    }
    if ((encodedArrays.size() == 1) && (firstArrayPosition == 0)) {
      return encodedArrays.get(0);
    }

    int totalLength = 0;

    for (int i = 0; i < encodedArrays.size(); i++) {
      byte[] bytes = encodedArrays.get(i);
      if (i == 0) {
        totalLength += bytes.length - firstArrayPosition;
      } else {
        totalLength += bytes.length;
      }
    }

    byte[] encodedBytes = new byte[totalLength];
    int destPos = 0;
    for (int i = 0; i < encodedArrays.size(); i++) {
      byte[] bytes = encodedArrays.get(i);
      if (i == 0) {
        System.arraycopy(
            bytes, firstArrayPosition, encodedBytes, destPos, bytes.length - firstArrayPosition);
        destPos += bytes.length - firstArrayPosition;
      } else {
        System.arraycopy(bytes, 0, encodedBytes, destPos, bytes.length);
        destPos += bytes.length;
      }
    }

    // replace the store with merged array, so that repeated calls
    // don't need to merge. The reads can handle both the versions.
    encodedArrays.clear();
    encodedArrays.add(encodedBytes);
    firstArrayPosition = 0;

    return encodedBytes;
  }
}