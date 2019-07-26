// clone pairs:1434:70%
// 2415:calcite/core/src/main/java/org/apache/calcite/sql2rel/SqlToRelConverter.java

public class Nicad_t1_calcite144
{
    public int lookupGroupExpr(SqlNode expr) {
      for (int i = 0; i < groupExprs.size(); i++) {
        SqlNode groupExpr = groupExprs.get(i);
        if (expr.equalsDeep(groupExpr, Litmus.IGNORE)) {
          return i;
        }
      }
      return -1;
    }
}