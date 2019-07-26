// clone pairs:893:90%
// 1423:kylin/source-jdbc/src/main/java/org/apache/kylin/source/jdbc/metadata/MySQLJdbcMetadata.java

public class Nicad_t1_kylin153
{
    public List<String> listTables(String catalog) throws SQLException {
        List<String> ret = new ArrayList<>();
        try (Connection con = SqlUtil.getConnection(dbconf);
                ResultSet res = con.getMetaData().getTables(catalog, null, null, null)) {
            String table;
            while (res.next()) {
                table = res.getString("TABLE_NAME");
                ret.add(table);
            }
        }
        return ret;
    }
}