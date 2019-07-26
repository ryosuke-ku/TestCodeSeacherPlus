// clone pairs:13336:70%
// 19539:beam/sdks/java/core/src/main/java/org/apache/beam/sdk/coders/AvroCoder.java

public class Nicad_t1_beam3553
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