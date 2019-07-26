// clone pairs:10182:80%
// 13679:beam/runners/samza/src/main/java/org/apache/beam/runners/samza/runtime/KeyedTimerData.java

public class Nicad_t1_beam_new22099
{
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }

    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    final KeyedTimerData<?> that = (KeyedTimerData<?>) o;

    return Arrays.equals(keyBytes, that.keyBytes) && timerData.equals(that.timerData);
  }
}