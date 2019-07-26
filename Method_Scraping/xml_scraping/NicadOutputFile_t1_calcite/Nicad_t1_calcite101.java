// clone pairs:1077:72%
// 1855:calcite/linq4j/src/main/java/org/apache/calcite/linq4j/Linq4j.java

public class Nicad_t1_calcite101
{
  private static <T> void closeIterator(Iterator<T> iterator) {
    if (iterator instanceof AutoCloseable) {
      try {
        ((AutoCloseable) iterator).close();
      } catch (RuntimeException e) {
        throw e;
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    }
  }
}