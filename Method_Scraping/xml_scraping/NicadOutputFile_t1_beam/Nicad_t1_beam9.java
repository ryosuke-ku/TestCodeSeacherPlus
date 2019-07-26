// clone pairs:293:86%
// 160:beam/runners/google-cloud-dataflow-java/worker/src/main/java/org/apache/beam/runners/dataflow/worker/OrderedCode.java

public class Nicad_t1_beam9
{
  public long readNumIncreasing() {
    if ((encodedArrays == null)
        || (encodedArrays.isEmpty())
        || ((encodedArrays.get(0)).length - firstArrayPosition < 1)) {
      throw new IllegalArgumentException("Invalid encoded byte array");
    }

    byte[] store = encodedArrays.get(0);
    // Decode length byte
    int len = store[firstArrayPosition];
    if ((firstArrayPosition + len + 1 > store.length) || len > 8) {
      throw new IllegalArgumentException("Invalid encoded byte array");
    }

    long result = 0;
    for (int i = 0; i < len; i++) {
      result <<= 8;
      result |= (store[firstArrayPosition + i + 1] & 0xff);
    }

    if ((store.length - firstArrayPosition - len - 1) == 0) {
      // we are done with the first array
      encodedArrays.remove(0);
      firstArrayPosition = 0;
    } else {
      firstArrayPosition = firstArrayPosition + len + 1;
    }

    return result;
  }
}