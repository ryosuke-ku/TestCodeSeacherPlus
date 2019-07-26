// clone pairs:4:79%
// 2:beam/runners/google-cloud-dataflow-java/worker/src/main/java/org/apache/beam/runners/dataflow/worker/OrderedCode.java

public class Nicad_t1_beam_2nd1
{
  public byte[] readBytes() {
    if ((encodedArrays == null)
        || (encodedArrays.isEmpty())
        || ((encodedArrays.get(0)).length - firstArrayPosition <= 0)) {
      throw new IllegalArgumentException("Invalid encoded byte array");
    }

    // Determine the length of the decoded array
    // We only scan up to "length-2" since a valid string must end with
    // a two character terminator: 'ESCAPE1 SEPARATOR'
    byte[] store = encodedArrays.get(0);
    int decodedLength = 0;
    boolean valid = false;
    int i = firstArrayPosition;
    while (i < store.length - 1) {
      byte b = store[i++];
      if (b == ESCAPE1) {
        b = store[i++];
        if (b == SEPARATOR) {
          valid = true;
          break;
        } else if (b == NULL_CHARACTER) {
          decodedLength++;
        } else {
          throw new IllegalArgumentException("Invalid encoded byte array");
        }
      } else if (b == ESCAPE2) {
        b = store[i++];
        if (b == FF_CHARACTER) {
          decodedLength++;
        } else {
          throw new IllegalArgumentException("Invalid encoded byte array");
        }
      } else {
        decodedLength++;
      }
    }
    if (!valid) {
      throw new IllegalArgumentException("Invalid encoded byte array");
    }

    byte[] decodedArray = new byte[decodedLength];
    int copyStart = firstArrayPosition;
    int outIndex = 0;
    int j = firstArrayPosition;
    while (j < store.length - 1) {
      byte b = store[j++]; // note that j has been incremented
      if (b == ESCAPE1) {
        System.arraycopy(store, copyStart, decodedArray, outIndex, j - copyStart - 1);
        outIndex += j - copyStart - 1;
        // ESCAPE1 SEPARATOR ends component
        // ESCAPE1 NULL_CHARACTER represents '\0'
        b = store[j++];
        if (b == SEPARATOR) {
          if ((store.length - j) == 0) {
            // we are done with the first array
            encodedArrays.remove(0);
            firstArrayPosition = 0;
          } else {
            firstArrayPosition = j;
          }
          return decodedArray;
        } else if (b == NULL_CHARACTER) {
          decodedArray[outIndex++] = 0x00;
        } // else not required - handled during length determination
        copyStart = j;
      } else if (b == ESCAPE2) {
        System.arraycopy(store, copyStart, decodedArray, outIndex, j - copyStart - 1);
        outIndex += j - copyStart - 1;
        // ESCAPE2 FF_CHARACTER represents '\xff'
        // ESCAPE2 INFINITY is an error
        b = store[j++];
        if (b == FF_CHARACTER) {
          decodedArray[outIndex++] = (byte) 0xff;
        } // else not required - handled during length determination
        copyStart = j;
      }
    }
    // not required due to the first phase, but need to entertain the compiler
    throw new IllegalArgumentException("Invalid encoded byte array");
  }
}