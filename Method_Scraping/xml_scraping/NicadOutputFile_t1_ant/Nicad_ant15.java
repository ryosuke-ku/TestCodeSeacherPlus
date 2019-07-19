// clone pairs:33:89%
// 55:ant/src/main/org/apache/tools/ant/taskdefs/optional/net/FTP.java

public class Nicad_ant15
{
        public FTPFile[] listFiles(String directory, boolean changedir) {
            String currentPath = directory;
            if (changedir) {
                try {
                    if (!ftp.changeWorkingDirectory(directory)) {
                        return null;
                    }
                    currentPath = ftp.printWorkingDirectory();
                } catch (IOException ioe) {
                    throw new BuildException(ioe, getLocation());
                }
            }
            if (fileListMap.containsKey(currentPath)) {
                getProject().log("filelist map used in listing files", Project.MSG_DEBUG);
                return fileListMap.get(currentPath);
            }
            FTPFile[] result;
            try {
                result = ftp.listFiles();
            } catch (IOException ioe) {
                throw new BuildException(ioe, getLocation());
            }
            fileListMap.put(currentPath, result);
            if (!remoteSensitivityChecked) {
                checkRemoteSensitivity(result, directory);
            }
            return result;
        }
}