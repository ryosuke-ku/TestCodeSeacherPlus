// clone pairs:25:98%
// 38:kylin/server-base/src/main/java/org/apache/kylin/rest/service/QueryService.java

public class Nicad_t1_kylin2
{
    private void setParam(PreparedStatement preparedState, int index, PrepareSqlRequest.StateParam param)
            throws SQLException {
        boolean isNull = (null == param.getValue());

        Class<?> clazz;
        try {
            clazz = Class.forName(param.getClassName());
        } catch (ClassNotFoundException e) {
            throw new InternalErrorException(e);
        }

        Rep rep = Rep.of(clazz);

        switch (rep) {
        case PRIMITIVE_CHAR:
        case CHARACTER:
        case STRING:
            preparedState.setString(index, isNull ? null : String.valueOf(param.getValue()));
            break;
        case PRIMITIVE_INT:
        case INTEGER:
            preparedState.setInt(index, isNull ? 0 : Integer.parseInt(param.getValue()));
            break;
        case PRIMITIVE_SHORT:
        case SHORT:
            preparedState.setShort(index, isNull ? 0 : Short.parseShort(param.getValue()));
            break;
        case PRIMITIVE_LONG:
        case LONG:
            preparedState.setLong(index, isNull ? 0 : Long.parseLong(param.getValue()));
            break;
        case PRIMITIVE_FLOAT:
        case FLOAT:
            preparedState.setFloat(index, isNull ? 0 : Float.parseFloat(param.getValue()));
            break;
        case PRIMITIVE_DOUBLE:
        case DOUBLE:
            preparedState.setDouble(index, isNull ? 0 : Double.parseDouble(param.getValue()));
            break;
        case PRIMITIVE_BOOLEAN:
        case BOOLEAN:
            preparedState.setBoolean(index, !isNull && Boolean.parseBoolean(param.getValue()));
            break;
        case PRIMITIVE_BYTE:
        case BYTE:
            preparedState.setByte(index, isNull ? 0 : Byte.parseByte(param.getValue()));
            break;
        case JAVA_UTIL_DATE:
        case JAVA_SQL_DATE:
            preparedState.setDate(index, isNull ? null : java.sql.Date.valueOf(param.getValue()));
            break;
        case JAVA_SQL_TIME:
            preparedState.setTime(index, isNull ? null : Time.valueOf(param.getValue()));
            break;
        case JAVA_SQL_TIMESTAMP:
            preparedState.setTimestamp(index, isNull ? null : Timestamp.valueOf(param.getValue()));
            break;
        default:
            preparedState.setObject(index, isNull ? null : param.getValue());
        }
    }
}