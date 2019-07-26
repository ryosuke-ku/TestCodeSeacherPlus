// clone pairs:1031:83%
// 1763:calcite/core/src/main/java/org/apache/calcite/rex/RexProgram.java

public class Nicad_t1_calcite87
{
    @Override public Boolean visitLocalRef(RexLocalRef localRef) {
      final int index = localRef.getIndex();
      if ((index < 0) || (index >= internalExprTypeList.size())) {
        ++failCount;
        return litmus.fail(null);
      }
      if (!RelOptUtil.eq(
          "type1",
          localRef.getType(),
          "type2",
          internalExprTypeList.get(index), litmus)) {
        ++failCount;
        return litmus.fail(null);
      }
      return litmus.succeed();
    }
}