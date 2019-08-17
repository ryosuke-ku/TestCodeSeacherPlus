// clone pairs:4751:80%
// 6679:beam/sdks/java/core/src/main/java/org/apache/beam/sdk/transforms/ApproximateUnique.java

public class Nicad_t1_beam1289
{
      public boolean equals(Object o) {
        if (this == o) {
          return true;
        }
        if (o == null || getClass() != o.getClass()) {
          return false;
        }
        LargestUnique that = (LargestUnique) o;

        return sampleSize == that.sampleSize && Iterables.elementsEqual(heap, that.heap);
      }
}