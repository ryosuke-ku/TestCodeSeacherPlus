// clone pairs:1705:72%
// 1579:beam/sdks/java/core/src/main/java/org/apache/beam/sdk/transforms/Regex.java

public class Nicad_t1_beam108
{
    public PCollection<String> expand(PCollection<String> in) {
      return in.apply(
          ParDo.of(
              new DoFn<String, String>() {
                @ProcessElement
                public void processElement(@Element String element, OutputReceiver<String> r)
                    throws Exception {
                  Matcher m = pattern.matcher(element);
                  r.output(m.replaceAll(replacement));
                }
              }));
    }
}