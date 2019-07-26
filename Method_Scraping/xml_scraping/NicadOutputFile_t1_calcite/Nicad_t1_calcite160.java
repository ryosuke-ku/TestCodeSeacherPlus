// clone pairs:1495:70%
// 2537:calcite/core/src/main/java/org/apache/calcite/plan/RelOptUtil.java

public class Nicad_t1_calcite160
{
  public static void splitFilters(
      ImmutableBitSet childBitmap,
      RexNode predicate,
      List<RexNode> pushable,
      List<RexNode> notPushable) {
    // for each filter, if the filter only references the child inputs,
    // then it can be pushed
    for (RexNode filter : conjunctions(predicate)) {
      ImmutableBitSet filterRefs = InputFinder.bits(filter);
      if (childBitmap.contains(filterRefs)) {
        pushable.add(filter);
      } else {
        notPushable.add(filter);
      }
    }
  }
}