// clone pairs:7241:80%
// 10937:beam/runners/samza/src/main/java/org/apache/beam/runners/samza/runtime/KeyedTimerData.java

public class Nicad_t1_beam2126
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