// clone pairs:3098:90%
// 3877:beam/runners/core-construction-java/src/main/java/org/apache/beam/runners/core/construction/SerializablePipelineOptions.java

public class Nicad_t1_beam638
{
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SerializablePipelineOptions that = (SerializablePipelineOptions) o;
    return serializedPipelineOptions.equals(that.serializedPipelineOptions);
    // do not assert on this.options.equals(that.options) because PipelineOptions is a interface
    // and its equal compares references.
  }
}