// clone pairs:1276:84%
// 1121:beam/sdks/java/core/src/main/java/org/apache/beam/sdk/transforms/windowing/SlidingWindows.java

public class Nicad_t1_beam59
{
  public WindowMappingFn<IntervalWindow> getDefaultWindowMappingFn() {
    return new WindowMappingFn<IntervalWindow>() {
      @Override
      public IntervalWindow getSideInputWindow(BoundedWindow mainWindow) {
        if (mainWindow instanceof GlobalWindow) {
          throw new IllegalArgumentException(
              "Attempted to get side input window for GlobalWindow from non-global WindowFn");
        }
        long lastStart = lastStartFor(mainWindow.maxTimestamp().minus(size));
        return new IntervalWindow(new Instant(lastStart + period.getMillis()), size);
      }
    };
  }
}