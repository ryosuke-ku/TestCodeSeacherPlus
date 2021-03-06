// clone pairs:10561:70%
// 15953:beam/sdks/java/core/src/main/java/org/apache/beam/sdk/values/KV.java

public class Nicad_t1_beam3057
{
  public boolean equals(Object other) {
    if (this == other) {
      return true;
    }
    if (!(other instanceof KV)) {
      return false;
    }
    KV<?, ?> otherKv = (KV<?, ?>) other;
    // Arrays are very common as values and keys, so deepEquals is mandatory
    return Objects.deepEquals(this.key, otherKv.key)
        && Objects.deepEquals(this.value, otherKv.value);
  }
}