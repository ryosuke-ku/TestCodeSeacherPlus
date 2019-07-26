// clone pairs:13408:80%
// 19655:beam/runners/google-cloud-dataflow-java/worker/src/main/java/org/apache/beam/runners/dataflow/worker/WindmillStateReader.java

public class Nicad_t1_beam3575
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