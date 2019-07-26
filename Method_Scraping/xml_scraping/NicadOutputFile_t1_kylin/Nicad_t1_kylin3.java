// clone pairs:28:98%
// 43:kylin/source-jdbc/src/main/java/org/apache/kylin/source/jdbc/SqlUtil.java

public class Nicad_t1_kylin3
{
    public static String jdbcTypeToKylinDataType(int sqlType) {
        String result = "any";

        switch (sqlType) {
        case Types.CHAR:
            result = "char";
            break;
        case Types.VARCHAR:
        case Types.NVARCHAR:
        case Types.LONGVARCHAR:
            result = "varchar";
            break;
        case Types.NUMERIC:
        case Types.DECIMAL:
            result = "decimal";
            break;
        case Types.BIT:
        case Types.BOOLEAN:
            result = "boolean";
            break;
        case Types.TINYINT:
            result = "tinyint";
            break;
        case Types.SMALLINT:
            result = "smallint";
            break;
        case Types.INTEGER:
            result = "integer";
            break;
        case Types.BIGINT:
            result = "bigint";
            break;
        case Types.REAL:
        case Types.FLOAT:
        case Types.DOUBLE:
            result = "double";
            break;
        case Types.BINARY:
        case Types.VARBINARY:
        case Types.LONGVARBINARY:
            result = "byte";
            break;
        case Types.DATE:
            result = "date";
            break;
        case Types.TIME:
            result = "time";
            break;
        case Types.TIMESTAMP:
            result = "timestamp";
            break;
        default:
            //do nothing
            break;
        }

        return result;
    }
}