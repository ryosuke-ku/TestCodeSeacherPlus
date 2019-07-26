// clone pairs:714:83%
// 1176:kylin/core-common/src/main/java/org/apache/kylin/common/KylinVersion.java

public class Nicad_t1_kylin122
{
    public static String getKylinClientInformation() {
        StringBuilder buf = new StringBuilder();

        buf.append("kylin.home: ").append(
                KylinConfig.getKylinHome() == null ? "UNKNOWN" : new File(KylinConfig.getKylinHome()).getAbsolutePath())
                .append("\n");
        buf.append("kylin.version:").append(KylinVersion.getCurrentVersion()).append("\n");
        buf.append("commit:").append(getGitCommitInfo()).append("\n");
        buf.append("os.name:").append(System.getProperty("os.name")).append("\n");
        buf.append("os.arch:").append(System.getProperty("os.arch")).append("\n");
        buf.append("os.version:").append(System.getProperty("os.version")).append("\n");
        buf.append("java.version:").append(System.getProperty("java.version")).append("\n");
        buf.append("java.vendor:").append(System.getProperty("java.vendor"));

        return buf.toString();
    }
}