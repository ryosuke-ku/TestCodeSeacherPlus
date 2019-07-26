// clone pairs:2094:72%
// 2167:beam/runners/spark/src/main/java/org/apache/beam/runners/spark/stateful/SparkStateInternals.java

public class Nicad_t1_beam250
{
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      @SuppressWarnings("unchecked")
      AbstractState<?> that = (AbstractState<?>) o;
      return namespace.equals(that.namespace) && address.equals(that.address);
    }
}