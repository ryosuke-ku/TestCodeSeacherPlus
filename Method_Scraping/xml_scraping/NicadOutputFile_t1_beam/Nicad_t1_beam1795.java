// clone pairs:6041:90%
// 8897:beam/runners/spark/src/main/java/org/apache/beam/runners/spark/translation/GroupNonMergingWindowsFunctions.java

public class Nicad_t1_beam1795
{
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      WindowedKey that = (WindowedKey) o;
      return Arrays.equals(key, that.key) && Arrays.equals(window, that.window);
    }
}