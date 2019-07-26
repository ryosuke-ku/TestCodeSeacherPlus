// clone pairs:8834:100%
// 13594:beam/sdks/java/io/hadoop-common/src/main/java/org/apache/beam/sdk/io/hadoop/WritableCoder.java

public class Nicad_t1_beam2674
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