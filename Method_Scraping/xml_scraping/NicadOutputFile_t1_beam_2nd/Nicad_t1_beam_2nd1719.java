// clone pairs:7971:90%
// 10825:beam/sdks/java/core/src/main/java/org/apache/beam/sdk/transforms/ApproximateUnique.java

public class Nicad_t1_beam_2nd1719
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