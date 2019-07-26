// clone pairs:342:100%
// 498:kylin/storage-hbase/src/main/java/org/apache/kylin/storage/hbase/util/DeployCoprocessorCLI.java

public class Nicad_t1_kylin36
{
    private static List<String> filterByCubes(List<String> allTableNames, List<String> cubeNames) {
        CubeManager cubeManager = CubeManager.getInstance(KylinConfig.getInstanceFromEnv());
        List<String> result = Lists.newArrayList();
        for (String c : cubeNames) {
            c = c.trim();
            if (c.endsWith(","))
                c = c.substring(0, c.length() - 1);

            CubeInstance cubeInstance = cubeManager.getCube(c);
            for (CubeSegment segment : cubeInstance.getSegments()) {
                String tableName = segment.getStorageLocationIdentifier();
                if (allTableNames.contains(tableName)) {
                    result.add(tableName);
                }
            }
        }
        return result;
    }
}