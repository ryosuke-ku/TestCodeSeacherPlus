// clone pairs:191:70%
// 293:ant/src/main/org/apache/tools/ant/taskdefs/optional/net/FTP.java

public class Nicad_ant37
{
    protected void rmDir(FTPClient ftp, String dirname)
        throws IOException, BuildException {
        if (verbose) {
            log("removing " + dirname);
        }

        if (!ftp.removeDirectory(resolveFile(dirname))) {
            String s = "could not remove directory: " + ftp.getReplyString();

            if (skipFailedTransfers) {
                log(s, Project.MSG_WARN);
                skipped++;
            } else {
                throw new BuildException(s);
            }
        } else {
            log("Directory " + dirname + " removed from " + server,
                Project.MSG_VERBOSE);
            transferred++;
        }
    }
}