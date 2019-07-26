// clone pairs:1167:72%
// 1996:calcite/core/src/main/java/org/apache/calcite/sql2rel/SqlToRelConverter.java

public class Nicad_t1_calcite109
{
  private static boolean containsNullLiteral(SqlNodeList valueList) {
    for (SqlNode node : valueList.getList()) {
      if (node instanceof SqlLiteral) {
        SqlLiteral lit = (SqlLiteral) node;
        if (lit.getValue() == null) {
          return true;
        }
      }
    }
    return false;
  }
}