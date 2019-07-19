// clone pairs:12:70%
// 17:ant/src/main/org/apache/tools/ant/taskdefs/optional/net/FTP.java

public class Nicad_ant6
{
    private boolean isFunctioningAsDirectory(FTPClient ftp, String dir, FTPFile file) throws FTPConnectionClosedException {
        if (file.isDirectory()) {
            return true;
        }
        if (file.isFile()) {
            return false;
        }
        String currentWorkingDir = null;
        try {
            currentWorkingDir = ftp.printWorkingDirectory();
        } catch (FTPConnectionClosedException ftpcce) {
            getProject().log("could not find current working directory " + dir
                             + " while checking a symlink because connection was closed",
                             Project.MSG_DEBUG);
            throw(ftpcce);
        } catch (IOException ioe) {
            getProject().log("could not find current working directory " + dir
                             + " while checking a symlink",
                             Project.MSG_DEBUG);
        }
        boolean result = false;
        if (currentWorkingDir != null) {
            try {
                result = ftp.changeWorkingDirectory(file.getLink());
            } catch (FTPConnectionClosedException ftpcce) {
                getProject().log("could not find current working directory " + dir
                                + " while checking a symlink because connection was closed",
                                Project.MSG_DEBUG);
                throw(ftpcce);
            } catch (IOException ioe) {
                getProject().log("could not cd to " + file.getLink() + " while checking a symlink",
                                 Project.MSG_DEBUG);
            }
            if (result) {
                boolean comeback = false;
                try {
                    comeback = ftp.changeWorkingDirectory(currentWorkingDir);
                } catch (IOException ioe) {
                    getProject().log("could not cd back to " + dir + " while checking a symlink",
                                     Project.MSG_ERR);
                } finally {
                    if (!comeback) {
                        throw new BuildException(
                            "could not cd back to %s while checking a symlink",
                            dir);
                    }
                }
            }
        }
        return result;
    }
}