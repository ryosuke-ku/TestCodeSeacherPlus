// clone pairs:15560:80%
// 17466:beam/runners/samza/src/main/java/org/apache/beam/runners/samza/runtime/KeyedTimerData.java

public class Nicad_t1_beam_new22428
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