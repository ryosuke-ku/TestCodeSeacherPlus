// clone pairs:384:100%
// 634:ant/src/main/org/apache/tools/ant/taskdefs/AbstractCvsTask.java

public class Nicad_t2_ant_96_1002
{
    protected OutputStream getOutputStream() {

        if (this.outputStream == null) {

            if (output != null) {
                try {
                    setOutputStream(new PrintStream(
                                        new BufferedOutputStream(
                                            FileUtils.newOutputStream(Paths.get(output.getPath()),
                                                                 append))));
                } catch (IOException e) {
                    throw new BuildException(e, getLocation());
                }
            } else {
                setOutputStream(new LogOutputStream(this, Project.MSG_INFO));
            }
        }

        return this.outputStream;
    }
}