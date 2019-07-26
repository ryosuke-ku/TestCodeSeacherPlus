// clone pairs:617:82%
// 451:beam/sdks/java/core/src/main/java/org/apache/beam/sdk/transforms/FlatMapElements.java

public class Nicad_t1_beam_2nd26
{
      public void processElement(@Element InputT element, MultiOutputReceiver r, ProcessContext c)
          throws Exception {
        boolean exceptionWasThrown = false;
        Iterable<OutputT> res = null;
        try {
          res = fn.getClosure().apply(c.element(), Fn.Context.wrapProcessContext(c));
        } catch (Exception e) {
          exceptionWasThrown = true;
          ExceptionElement<InputT> exceptionElement = ExceptionElement.of(element, e);
          r.get(failureTag).output(exceptionHandler.apply(exceptionElement));
        }
        // We make sure our outputs occur outside the try block, since runners may implement
        // fusion by having output() directly call the body of another DoFn, potentially catching
        // exceptions unrelated to this transform.
        if (!exceptionWasThrown) {
          for (OutputT output : res) {
            r.get(outputTag).output(output);
          }
        }
      }
}