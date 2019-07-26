// clone pairs:189:82%
// 289:ant/src/main/org/apache/tools/ant/taskdefs/optional/net/FTP.java

public class Nicad_t2_ant_81_852
{
    protected void delFile(FTPClient ftp, String filename)
        throws IOException, BuildException {
        if (verbose) {
            log("deleting " + filename);
        }

        if (!ftp.deleteFile(resolveFile(filename))) {
            String s = "could not delete file: " + ftp.getReplyString();

            if (skipFailedTransfers) {
                log(s, Project.MSG_WARN);
                skipped++;
            } else {
                throw new BuildException(s);
            }
        } else {
            log("File " + filename + " deleted from " + server,
                Project.MSG_VERBOSE);
            transferred++;
        }
    }
}