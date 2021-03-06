// clone pairs:1218:76%
// 939:beam/sdks/java/core/src/main/java/org/apache/beam/sdk/schemas/Schema.java

public class Nicad_t1_beam_new243
{
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Schema other = (Schema) o;
    // If both schemas have a UUID set, we can simply compare the UUIDs.
    if (uuid != null && other.uuid != null) {
      return Objects.equals(uuid, other.uuid);
    }
    return Objects.equals(fieldIndices, other.fieldIndices)
        && Objects.equals(getFields(), other.getFields());
  }
}