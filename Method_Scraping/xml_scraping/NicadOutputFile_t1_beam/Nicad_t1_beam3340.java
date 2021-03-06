// clone pairs:12540:80%
// 18245:beam/sdks/java/core/src/main/java/org/apache/beam/sdk/io/range/ByteKeyRange.java

public class Nicad_t1_beam3340
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