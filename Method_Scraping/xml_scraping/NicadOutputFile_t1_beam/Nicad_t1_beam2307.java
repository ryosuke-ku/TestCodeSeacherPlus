// clone pairs:7863:70%
// 11980:beam/sdks/java/core/src/main/java/org/apache/beam/sdk/coders/AvroCoder.java

public class Nicad_t1_beam2307
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