// clone pairs:404:70%
// 241:beam/sdks/java/harness/src/main/java/org/apache/beam/fn/harness/AssignWindowsRunner.java

public class Nicad_t1_beam18
{
  WindowedValue<T> assignWindows(WindowedValue<T> input) throws Exception {
    // TODO: BEAM-4272 consider allocating only once and updating the current value per call.
    WindowFn<T, W>.AssignContext ctxt =
        windowFn.new AssignContext() {
          @Override
          public T element() {
            return input.getValue();
          }

          @Override
          public Instant timestamp() {
            return input.getTimestamp();
          }

          @Override
          public BoundedWindow window() {
            return Iterables.getOnlyElement(input.getWindows());
          }
        };
    Collection<W> windows = windowFn.assignWindows(ctxt);
    return WindowedValue.of(input.getValue(), input.getTimestamp(), windows, input.getPane());
  }
}