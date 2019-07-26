// clone pairs:1845:90%
// 1677:beam/runners/core-java/src/main/java/org/apache/beam/runners/core/ReduceFnRunner.java

public class Nicad_t1_beam_2nd145
{
  private Set<W> collectWindows(Iterable<WindowedValue<InputT>> values) throws Exception {
    Set<W> windows = new HashSet<>();
    for (WindowedValue<?> value : values) {
      for (BoundedWindow untypedWindow : value.getWindows()) {
        @SuppressWarnings("unchecked")
        W window = (W) untypedWindow;
        windows.add(window);
      }
    }
    return windows;
  }
}