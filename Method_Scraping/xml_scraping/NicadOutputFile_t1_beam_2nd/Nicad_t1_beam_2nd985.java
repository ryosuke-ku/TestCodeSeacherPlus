// clone pairs:5060:90%
// 6501:beam/runners/google-cloud-dataflow-java/worker/src/main/java/org/apache/beam/runners/dataflow/worker/WindmillStateReader.java

public class Nicad_t1_beam_2nd985
{
    public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      }

      if (!(obj instanceof StateTag)) {
        return false;
      }

      StateTag that = (StateTag) obj;
      return Objects.equal(this.kind, that.kind)
          && Objects.equal(this.tag, that.tag)
          && Objects.equal(this.stateFamily, that.stateFamily)
          && Objects.equal(this.requestPosition, that.requestPosition);
    }
}