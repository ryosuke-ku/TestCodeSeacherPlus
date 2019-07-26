// clone pairs:1681:72%
// 1424:beam/sdks/java/extensions/sql/src/main/java/org/apache/beam/sdk/extensions/sql/impl/utils/CalciteUtils.java

public class Nicad_t1_beam_new294
{
  public static FieldType toFieldType(SqlTypeName sqlTypeName) {
    switch (sqlTypeName) {
      case MAP:
      case MULTISET:
      case ARRAY:
      case ROW:
        throw new IllegalArgumentException(
            String.format(
                "%s is a type constructor that takes parameters, not a type,"
                    + "so it cannot be converted to a %s",
                sqlTypeName, Schema.FieldType.class.getSimpleName()));
      default:
        return CALCITE_TO_BEAM_TYPE_MAPPING.get(sqlTypeName);
    }
  }
}