// clone pairs:15567:80%
// 17479:beam/runners/local-java/src/main/java/org/apache/beam/runners/local/StructuralKey.java

public class Nicad_t1_beam_2nd2442
{
    public boolean equals(Object other) {
      if (other == this) {
        return true;
      }
      if (other instanceof CoderStructuralKey) {
        CoderStructuralKey<?> that = (CoderStructuralKey<?>) other;
        return structuralValue.equals(that.structuralValue);
      }
      return false;
    }
}