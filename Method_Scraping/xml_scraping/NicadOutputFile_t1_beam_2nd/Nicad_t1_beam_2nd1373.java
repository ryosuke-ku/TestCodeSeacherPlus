// clone pairs:6588:70%
// 8807:beam/sdks/java/core/src/main/java/org/apache/beam/sdk/coders/AvroCoder.java

public class Nicad_t1_beam_2nd1373
{
  public boolean equals(Object other) {
    if (other == this) {
      return true;
    }
    if (!(other instanceof AvroCoder)) {
      return false;
    }
    AvroCoder<?> that = (AvroCoder<?>) other;
    return Objects.equals(this.schemaSupplier.get(), that.schemaSupplier.get())
        && Objects.equals(this.typeDescriptor, that.typeDescriptor);
  }
}