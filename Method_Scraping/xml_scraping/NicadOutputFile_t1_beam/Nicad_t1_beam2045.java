// clone pairs:6957:70%
// 10448:beam/sdks/java/core/src/main/java/org/apache/beam/sdk/values/ValueWithRecordId.java

public class Nicad_t1_beam2045
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