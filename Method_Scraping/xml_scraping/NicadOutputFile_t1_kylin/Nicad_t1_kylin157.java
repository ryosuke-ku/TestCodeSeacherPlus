// clone pairs:936:72%
// 1489:kylin/source-jdbc/src/main/java/org/apache/kylin/source/jdbc/metadata/DefaultJdbcMetadata.java

public class Nicad_t1_kylin157
{
    public List<String> listTables(String schema) throws SQLException {
        List<String> ret = new ArrayList<>();
        try (Connection con = SqlUtil.getConnection(dbconf);
                ResultSet rs = con.getMetaData().getTables(null, schema, null, null)) {
            while (rs.next()) {
                String name = rs.getString("TABLE_NAME");
                ret.add(name);
            }
        }
        return ret;
    }
}