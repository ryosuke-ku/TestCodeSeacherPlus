// clone pairs:1822:72%
// 1793:beam/runners/apex/src/main/java/org/apache/beam/runners/apex/translation/utils/ApexStateInternals.java

public class Nicad_t1_beam165
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