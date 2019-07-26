// clone pairs:705:75%
// 1157:kylin/source-jdbc/src/main/java/org/apache/kylin/source/jdbc/metadata/DefaultJdbcMetadata.java

public class Nicad_t1_kylin119
{
    public List<String> listDatabases() throws SQLException {
        List<String> ret = new ArrayList<>();
        try (Connection con = SqlUtil.getConnection(dbconf); ResultSet rs = con.getMetaData().getSchemas()) {
            while (rs.next()) {
                String schema = rs.getString("TABLE_SCHEM");
                String catalog = rs.getString("TABLE_CATALOG");
                logger.info(String.format(Locale.ROOT, "%s,%s", schema, catalog));
                ret.add(schema);
            }
        }
        return ret;
    }
}