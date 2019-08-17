// clone pairs:7860:90%
// 10671:beam/sdks/java/core/src/main/java/org/apache/beam/sdk/io/range/ByteKeyRange.java

public class Nicad_t1_beam_2nd1690
{
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (!(o instanceof ByteKeyRange)) {
      return false;
    }
    ByteKeyRange other = (ByteKeyRange) o;
    return Objects.equals(startKey, other.startKey) && Objects.equals(endKey, other.endKey);
  }
}