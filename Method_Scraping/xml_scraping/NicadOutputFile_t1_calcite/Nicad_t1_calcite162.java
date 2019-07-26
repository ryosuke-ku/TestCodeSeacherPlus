// clone pairs:1515:70%
// 2578:calcite/core/src/main/java/org/apache/calcite/rel/rules/DateRangeRules.java

public class Nicad_t1_calcite162
{
    boolean isFloorCeilCall(RexNode e) {
      switch (e.getKind()) {
      case FLOOR:
      case CEIL:
        final RexCall call = (RexCall) e;
        return call.getOperands().size() == 2;
      default:
        return false;
      }
    }
}