// clone pairs:1109:72%
// 1916:calcite/core/src/main/java/org/apache/calcite/sql/SqlOperatorBinding.java

public class Nicad_t1_calcite104
{
  public List<RelDataType> collectOperandTypes() {
    return new AbstractList<RelDataType>() {
      public RelDataType get(int index) {
        return getOperandType(index);
      }

      public int size() {
        return getOperandCount();
      }
    };
  }
}