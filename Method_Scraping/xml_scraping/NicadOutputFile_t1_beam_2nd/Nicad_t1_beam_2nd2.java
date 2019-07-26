// clone pairs:8:98%
// 4:beam/runners/google-cloud-dataflow-java/worker/src/main/java/org/apache/beam/runners/dataflow/worker/OrderedCode.java

public class Nicad_t1_beam_2nd2
{
  public long readSignedNumIncreasing() {
    if ((encodedArrays == null)
        || (encodedArrays.isEmpty())
        || ((encodedArrays.get(0)).length - firstArrayPosition < 1)) {
      throw new IllegalArgumentException("Invalid encoded byte array");
    }

    byte[] store = encodedArrays.get(0);

    long xorMask = ((store[firstArrayPosition] & 0x80) == 0) ? ~0L : 0L;
    // Store first byte as an int rather than a (signed) byte -- to avoid
    // accidental byte-to-int promotion later, which would extend the byte's
    // sign bit (if any).
    int firstByte = (store[firstArrayPosition] & 0xff) ^ (int) (xorMask & 0xff);

    // Now calculate and test length, and set x to raw (unmasked) result.
    int len;
    long x;
    if (firstByte != 0xff) {
      len = 7 - log2Floor(firstByte ^ 0xff);
      if (store.length - firstArrayPosition < len) {
        throw new IllegalArgumentException("Invalid encoded byte array");
      }
      x = xorMask; // Sign extend using xorMask.
      for (int i = firstArrayPosition; i < firstArrayPosition + len; i++) {
        x = (x << 8) | (store[i] & 0xff);
      }
    } else {
      len = 8;
      if (store.length - firstArrayPosition < len) {
        throw new IllegalArgumentException("Invalid encoded byte array");
      }
      int secondByte = (store[firstArrayPosition + 1] & 0xff) ^ (int) (xorMask & 0xff);
      if (secondByte >= 0x80) {
        if (secondByte < 0xc0) {
          len = 9;
        } else {
          int thirdByte = (store[firstArrayPosition + 2] & 0xff) ^ (int) (xorMask & 0xff);
          if (secondByte == 0xc0 && thirdByte < 0x80) {
            len = 10;
          } else {
            // Either len > 10 or len == 10 and #bits > 63.
            throw new IllegalArgumentException("Invalid encoded byte array");
          }
        }
        if (store.length - firstArrayPosition < len) {
          throw new IllegalArgumentException("Invalid encoded byte array");
        }
      }
      x =
          Longs.fromByteArray(
              Arrays.copyOfRange(store, firstArrayPosition + len - 8, firstArrayPosition + len));
    }

    x ^= LENGTH_TO_MASK[len]; // Remove spurious header bits.

    if (len != getSignedEncodingLength(x)) {
      throw new IllegalArgumentException("Invalid encoded byte array");
    }

    if ((store.length - firstArrayPosition - len) == 0) {
      // We are done with the first array.
      encodedArrays.remove(0);
      firstArrayPosition = 0;
    } else {
      firstArrayPosition = firstArrayPosition + len;
    }

    return x;
  }
}