// clone pairs:396:85%
// 229:beam/runners/google-cloud-dataflow-java/worker/src/main/java/org/apache/beam/runners/dataflow/worker/OrderedCode.java

public class Nicad_t1_beam17
{
  public boolean readInfinity() {
    if ((encodedArrays == null)
        || (encodedArrays.isEmpty())
        || ((encodedArrays.get(0)).length - firstArrayPosition < 1)) {
      throw new IllegalArgumentException("Invalid encoded byte array");
    }
    byte[] store = encodedArrays.get(0);
    if (store.length - firstArrayPosition < 2) {
      return false;
    }
    if ((store[firstArrayPosition] == ESCAPE2) && (store[firstArrayPosition + 1] == INFINITY)) {
      if ((store.length - firstArrayPosition - 2) == 0) {
        // we are done with the first array
        encodedArrays.remove(0);
        firstArrayPosition = 0;
      } else {
        firstArrayPosition = firstArrayPosition + 2;
      }
      return true;
    } else {
      return false;
    }
  }
}