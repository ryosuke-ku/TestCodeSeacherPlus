// clone pairs:528:81%
// 856:ant/src/main/org/apache/tools/ant/taskdefs/optional/net/FTP.java

public class Nicad_ant82
{
    protected void listFile(FTPClient ftp, BufferedWriter bw, String filename)
        throws IOException, BuildException {
        if (verbose) {
            log("listing " + filename);
        }
        FTPFile[] ftpfiles = ftp.listFiles(resolveFile(filename));

        if (ftpfiles != null && ftpfiles.length > 0) {
            bw.write(ftpfiles[0].toString());
            bw.newLine();
            transferred++;
        }
    }
}