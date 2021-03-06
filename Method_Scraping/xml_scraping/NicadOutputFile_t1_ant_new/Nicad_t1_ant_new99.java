// clone pairs:571:72%
// 887:ant/src/main/org/apache/tools/ant/util/JavaEnvUtils.java

public class Nicad_t1_ant_new99
{
    public static File createVmsJavaOptionFile(String[] cmds)
            throws IOException {
        File script = FILE_UTILS.createTempFile("ANT", ".JAVA_OPTS", null, false, true);
        try (BufferedWriter out = new BufferedWriter(new FileWriter(script))) {
            for (String cmd : cmds) {
                out.write(cmd);
                out.newLine();
            }
        }
        return script;
    }
}