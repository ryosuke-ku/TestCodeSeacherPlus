// clone pairs:278:75%
// 455:ant/src/main/org/apache/tools/ant/taskdefs/optional/net/FTP.java

public class Nicad_ant42
{
    protected void transferFiles(FTPClient ftp)
        throws IOException, BuildException {
        transferred = 0;
        skipped = 0;

        if (filesets.isEmpty()) {
            throw new BuildException("at least one fileset must be specified.");
        }
        for (FileSet fs : filesets) {
            if (fs != null) {
                transferFiles(ftp, fs);
            }
        }

        log(transferred + " " + ACTION_TARGET_STRS[action] + " "
            + COMPLETED_ACTION_STRS[action]);
        if (skipped != 0) {
            log(skipped + " " + ACTION_TARGET_STRS[action]
                + " were not successfully " + COMPLETED_ACTION_STRS[action]);
        }
    }
}