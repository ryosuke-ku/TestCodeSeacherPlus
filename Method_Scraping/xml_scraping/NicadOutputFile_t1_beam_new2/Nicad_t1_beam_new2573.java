// clone pairs:3433:90%
// 4060:beam/runners/flink/src/main/java/org/apache/beam/runners/flink/translation/wrappers/streaming/stableinput/BufferedElements.java

public class Nicad_t1_beam_new2573
{
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      Timer timer = (Timer) o;
      return timerId.equals(timer.timerId)
          && window.equals(timer.window)
          && timestamp.equals(timer.timestamp)
          && timeDomain == timer.timeDomain;
    }
}