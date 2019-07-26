// clone pairs:12451:90%
// 18094:beam/sdks/java/core/src/main/java/org/apache/beam/sdk/transforms/ApproximateUnique.java

public class Nicad_t1_beam3318
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