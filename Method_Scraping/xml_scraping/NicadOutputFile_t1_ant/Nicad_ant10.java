// clone pairs:22:78%
// 35:ant/src/main/org/apache/tools/ant/taskdefs/optional/net/FTP.java

public class Nicad_ant10
{
    protected boolean isUpToDate(FTPClient ftp, File localFile,
                                 String remoteFile)
        throws IOException, BuildException {
        log("checking date for " + remoteFile, Project.MSG_VERBOSE);

        FTPFile[] files = ftp.listFiles(remoteFile);

        // For Microsoft's Ftp-Service an Array with length 0 is
        // returned if configured to return listings in "MS-DOS"-Format
        if (files == null || files.length == 0) {
            // If we are sending files, then assume out of date.
            // If we are getting files, then throw an error

            if (action == SEND_FILES) {
                log("Could not date test remote file: " + remoteFile
                    + "assuming out of date.", Project.MSG_VERBOSE);
                return false;
            }
            throw new BuildException("could not date test remote file: %s",
                ftp.getReplyString());
        }

        long remoteTimestamp = files[0].getTimestamp().getTime().getTime();
        long localTimestamp = localFile.lastModified();
        long adjustedRemoteTimestamp =
            remoteTimestamp + this.timeDiffMillis + this.granularityMillis;

        StringBuilder msg;
        synchronized (TIMESTAMP_LOGGING_SDF) {
            msg = new StringBuilder("   [")
                .append(TIMESTAMP_LOGGING_SDF.format(new Date(localTimestamp)))
                .append("] local");
        }
        log(msg.toString(), Project.MSG_VERBOSE);

        synchronized (TIMESTAMP_LOGGING_SDF) {
            msg = new StringBuilder("   [")
                .append(TIMESTAMP_LOGGING_SDF
                    .format(new Date(adjustedRemoteTimestamp)))
                .append("] remote");
        }
        if (remoteTimestamp != adjustedRemoteTimestamp) {
            synchronized (TIMESTAMP_LOGGING_SDF) {
                msg.append(" - (raw: ")
                    .append(
                        TIMESTAMP_LOGGING_SDF.format(new Date(remoteTimestamp)))
                    .append(")");
            }
        }
        log(msg.toString(), Project.MSG_VERBOSE);

        if (this.action == SEND_FILES) {
            return adjustedRemoteTimestamp >= localTimestamp;
        }
        return localTimestamp >= adjustedRemoteTimestamp;
    }
}