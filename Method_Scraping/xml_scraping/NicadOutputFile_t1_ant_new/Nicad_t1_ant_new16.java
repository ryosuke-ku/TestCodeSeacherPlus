// clone pairs:35:88%
// 57:ant/src/main/org/apache/tools/ant/taskdefs/optional/net/FTP.java

public class Nicad_t1_ant_new16
{
    private long getTimeDiff(FTPClient ftp) {
        long returnValue = 0;
        File tempFile = findFileName(ftp);
        try {
            // create a local temporary file
            FILE_UTILS.createNewFile(tempFile);
            long localTimeStamp = tempFile.lastModified();
            BufferedInputStream instream = new BufferedInputStream(Files.newInputStream(tempFile.toPath()));
            ftp.storeFile(tempFile.getName(), instream);
            instream.close();
            boolean success = FTPReply.isPositiveCompletion(ftp.getReplyCode());
            if (success) {
                FTPFile[] ftpFiles = ftp.listFiles(tempFile.getName());
                if (ftpFiles.length == 1) {
                    long remoteTimeStamp = ftpFiles[0].getTimestamp().getTime().getTime();
                    returnValue = localTimeStamp - remoteTimeStamp;
                }
                ftp.deleteFile(ftpFiles[0].getName());
            }
            // delegate the deletion of the local temp file to the delete task
            // because of race conditions occurring on Windows
            Delete mydelete = new Delete();
            mydelete.bindToOwner(this);
            mydelete.setFile(tempFile.getCanonicalFile());
            mydelete.execute();
        } catch (Exception e) {
            throw new BuildException(e, getLocation());
        }
        return returnValue;
    }
}