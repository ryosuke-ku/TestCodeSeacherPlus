// clone pairs:267:75%
// 433:ant/src/main/org/apache/tools/ant/taskdefs/optional/vss/MSVSS.java

public class Nicad_t2_ant16
{
    protected String getLocalpath() {
        String lclPath = ""; //set to empty str if no local path return
        if (localPath != null) {
            //make sure m_LocalDir exists, create it if it doesn't
            File dir = getProject().resolveFile(localPath);
            if (!dir.exists()) {
                boolean done = dir.mkdirs() || dir.exists();
                if (!done) {
                    String msg = "Directory " + localPath + " creation was not "
                            + "successful for an unknown reason";
                    throw new BuildException(msg, getLocation());
                }
                getProject().log("Created dir: " + dir.getAbsolutePath());
            }
            lclPath = FLAG_OVERRIDE_WORKING_DIR + localPath;
        }
        return lclPath;
    }
}