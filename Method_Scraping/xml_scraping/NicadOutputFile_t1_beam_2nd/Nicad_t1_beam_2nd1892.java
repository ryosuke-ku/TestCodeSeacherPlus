// clone pairs:8834:100%
// 12067:beam/sdks/java/io/hadoop-common/src/main/java/org/apache/beam/sdk/io/hadoop/WritableCoder.java

public class Nicad_t1_beam_2nd1892
{
  public boolean equals(Object other) {
    if (other == this) {
      return true;
    }
    if (!(other instanceof WritableCoder)) {
      return false;
    }
    WritableCoder<?> that = (WritableCoder<?>) other;
    return Objects.equals(this.type, that.type);
  }
}