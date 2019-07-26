// clone pairs:1226:72%
// 2113:calcite/core/src/main/java/org/apache/calcite/sql/type/SqlTypeUtil.java

public class Nicad_t1_calcite115
{
  public static int findField(RelDataType type, String fieldName) {
    List<RelDataTypeField> fields = type.getFieldList();
    for (int i = 0; i < fields.size(); i++) {
      RelDataTypeField field = fields.get(i);
      if (field.getName().equals(fieldName)) {
        return i;
      }
    }
    return -1;
  }
}