// clone pairs:1496:100%
// 2540:calcite/core/src/main/java/org/apache/calcite/plan/RexImplicationChecker.java

public class Nicad_t1_calcite161
{
    private static RexNode removeCast(RexNode inputRef) {
      if (inputRef instanceof RexCall) {
        final RexCall castedRef = (RexCall) inputRef;
        final SqlOperator operator = castedRef.getOperator();
        if (operator instanceof SqlCastFunction) {
          inputRef = castedRef.getOperands().get(0);
        }
      }
      return inputRef;
    }
}