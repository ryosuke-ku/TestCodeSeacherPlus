// clone pairs:7108:80%
// 10710:beam/sdks/java/core/src/main/java/org/apache/beam/sdk/io/range/ByteKey.java

public class Nicad_t1_beam2089
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