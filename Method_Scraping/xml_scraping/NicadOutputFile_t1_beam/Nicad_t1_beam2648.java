// clone pairs:8772:70%
// 13496:beam/sdks/java/io/hadoop-common/src/main/java/org/apache/beam/sdk/io/hadoop/WritableCoder.java

public class Nicad_t1_beam2648
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