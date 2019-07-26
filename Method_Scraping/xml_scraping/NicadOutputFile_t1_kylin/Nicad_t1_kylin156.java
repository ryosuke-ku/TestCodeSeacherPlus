// clone pairs:920:72%
// 1461:kylin/core-common/src/main/java/org/apache/kylin/common/util/HiveCmdBuilder.java

public class Nicad_t1_kylin156
{
    private String parseProps() {
        StringBuilder s = new StringBuilder();
        for (Map.Entry<String, String> prop : hiveConfProps.entrySet()) {
            s.append(" --hiveconf ");
            s.append(prop.getKey());
            s.append("=");
            s.append(prop.getValue());
        }
        return s.toString();
    }
}