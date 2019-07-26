// clone pairs:1706:72%
// 1581:beam/sdks/java/core/src/main/java/org/apache/beam/sdk/transforms/Regex.java

public class Nicad_t1_beam109
{
    public PCollection<String> expand(PCollection<String> in) {
      return in.apply(
          ParDo.of(
              new DoFn<String, String>() {
                @ProcessElement
                public void processElement(@Element String element, OutputReceiver<String> r)
                    throws Exception {
                  Matcher m = pattern.matcher(element);
                  r.output(m.replaceFirst(replacement));
                }
              }));
    }
}