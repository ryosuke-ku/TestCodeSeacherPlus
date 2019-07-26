// clone pairs:9764:70%
// 15073:beam/runners/google-cloud-dataflow-java/src/main/java/org/apache/beam/runners/dataflow/internal/IsmFormat.java

public class Nicad_t1_beam2988
{
    public boolean equals(Object other) {
      if (other == this) {
        return true;
      }
      if (!(other instanceof IsmRecordCoder)) {
        return false;
      }
      IsmRecordCoder<?> that = (IsmRecordCoder<?>) other;
      return Objects.equals(this.numberOfShardKeyCoders, that.numberOfShardKeyCoders)
          && Objects.equals(
              this.numberOfMetadataShardKeyCoders, that.numberOfMetadataShardKeyCoders)
          && Objects.equals(this.keyComponentCoders, that.keyComponentCoders)
          && Objects.equals(this.valueCoder, that.valueCoder);
    }
}