// clone pairs:31:96%
// 49:ant/src/main/org/apache/tools/ant/taskdefs/optional/net/FTP.java

public class Nicad_t1_ant_new14
{
    private File findFileName(FTPClient ftp) {
        FTPFile[] files = null;
        final int maxIterations = 1000;
        for (int counter = 1; counter < maxIterations; counter++) {
            File localFile = FILE_UTILS.createTempFile(
                                                       "ant" + Integer.toString(counter), ".tmp",
                                                       null, false, false);
            String fileName = localFile.getName();
            boolean found = false;
            try {
                if (files == null) {
                    files = ftp.listFiles();
                }
                for (FTPFile file : files) {
                    if (file != null && file.getName().equals(fileName)) {
                        found = true;
                        break;
                    }
                }
            } catch (IOException ioe) {
                throw new BuildException(ioe, getLocation());
            }
            if (!found) {
                localFile.deleteOnExit();
                return localFile;
            }
        }
        return null;
    }
}