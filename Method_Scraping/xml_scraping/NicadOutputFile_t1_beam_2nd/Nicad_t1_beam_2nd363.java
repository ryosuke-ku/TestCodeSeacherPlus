// clone pairs:2740:80%
// 2946:beam/sdks/java/core/src/main/java/org/apache/beam/sdk/transforms/ReifyTimestamps.java

public class Nicad_t1_beam_2nd363
{
    public PCollection<T> expand(PCollection<? extends T> input) {
      return input.apply(
          ParDo.of(
              new DoFn<T, T>() {
                @ProcessElement
                public void process(@Element T element, OutputReceiver<T> r) {
                  r.output(element);
                }
              }));
    }
}