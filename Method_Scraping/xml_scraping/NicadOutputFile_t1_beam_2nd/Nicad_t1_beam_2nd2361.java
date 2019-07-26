// clone pairs:15394:90%
// 17146:beam/sdks/java/core/src/main/java/org/apache/beam/sdk/coders/AvroCoder.java

public class Nicad_t1_beam_2nd2361
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