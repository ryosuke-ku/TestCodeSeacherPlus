// clone pairs:12141:80%
// 17582:beam/sdks/java/core/src/main/java/org/apache/beam/sdk/io/range/ByteKey.java

public class Nicad_t1_beam3246
{
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (!(o instanceof ByteKey)) {
      return false;
    }
    ByteKey other = (ByteKey) o;
    return (other.value.size() == value.size()) && this.compareTo(other) == 0;
  }
}