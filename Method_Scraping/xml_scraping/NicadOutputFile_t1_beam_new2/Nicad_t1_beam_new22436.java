// clone pairs:15593:90%
// 17508:beam/runners/google-cloud-dataflow-java/worker/src/main/java/org/apache/beam/runners/dataflow/worker/util/common/worker/ShuffleEntry.java

public class Nicad_t1_beam_new22436
{
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o instanceof ShuffleEntry) {
      ShuffleEntry that = (ShuffleEntry) o;
      return (this.position == null ? that.position == null : this.position.equals(that.position))
          && (this.key == null ? that.key == null : Arrays.equals(this.key, that.key))
          && (this.secondaryKey == null
              ? that.secondaryKey == null
              : Arrays.equals(this.secondaryKey, that.secondaryKey))
          && (this.value == null ? that.value == null : Arrays.equals(this.value, that.value));
    }
    return false;
  }
}