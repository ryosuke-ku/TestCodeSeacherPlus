// clone pairs:1428:90%
// 2404:calcite/core/src/main/java/org/apache/calcite/util/ImmutableBitSet.java

public class Nicad_t1_calcite140
{
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof ImmutableBitSet)) {
      return false;
    }
    ImmutableBitSet set = (ImmutableBitSet) obj;
    return Arrays.equals(words, set.words);
  }
}