// clone pairs:864:100%
// 1386:kylin/storage-hbase/src/main/java/org/apache/kylin/storage/hbase/util/DeployCoprocessorCLI.java

public class Nicad_t1_kylin152
{
    private static List<String> filterByTables(List<String> allTableNames, List<String> tableNames) {
        List<String> result = Lists.newArrayList();
        for (String t : tableNames) {
            t = t.trim();
            if (t.endsWith(","))
                t = t.substring(0, t.length() - 1);

            if (allTableNames.contains(t)) {
                result.add(t);
            }
        }
        return result;
    }
}