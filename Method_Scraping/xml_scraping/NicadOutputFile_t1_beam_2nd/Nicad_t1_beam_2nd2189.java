// clone pairs:15026:80%
// 16425:beam/sdks/java/core/src/main/java/org/apache/beam/sdk/values/ValueWithRecordId.java

public class Nicad_t1_beam_2nd2189
{
  public boolean equals(Object other) {
    if (this == other) {
      return true;
    }
    if (!(other instanceof ValueWithRecordId)) {
      return false;
    }
    ValueWithRecordId<?> otherRecord = (ValueWithRecordId<?>) other;
    return Objects.deepEquals(id, otherRecord.id) && Objects.deepEquals(value, otherRecord.value);
  }
}