// clone pairs:234:88%
// 367:ant/src/main/org/apache/tools/ant/util/JavaEnvUtils.java

public class Nicad_t2_ant11
{
    public static String getJreExecutable(String command) {
        if (IS_NETWARE) {
            // Extrapolating from:
            // "NetWare may have a "java" in that directory, but 99% of
            // the time, you don't want to execute it" -- Jeff Tulley
            // <JTULLEY@novell.com>
            return command;
        }

        File jExecutable = null;

        if (IS_AIX) {
            // On IBM's JDK 1.2 the directory layout is different, 1.3 follows
            // Sun's layout.
            jExecutable = findInDir(JAVA_HOME + "/sh", command);
        }

        if (jExecutable == null) {
            jExecutable = findInDir(JAVA_HOME + "/bin", command);
        }

        if (jExecutable != null) {
            return jExecutable.getAbsolutePath();
        } else {
            // Unfortunately on Windows java.home doesn't always refer
            // to the correct location, so we need to fall back to
            // assuming java is somewhere on the PATH.
            return addExtension(command);
        }
    }
}