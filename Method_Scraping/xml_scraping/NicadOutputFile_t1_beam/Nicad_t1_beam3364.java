// clone pairs:12623:80%
// 18384:beam/runners/samza/src/main/java/org/apache/beam/runners/samza/runtime/KeyedTimerData.java

public class Nicad_t1_beam3364
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