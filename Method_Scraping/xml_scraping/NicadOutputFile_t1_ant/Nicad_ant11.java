// clone pairs:23:87%
// 37:ant/src/main/org/apache/tools/ant/taskdefs/optional/net/FTP.java

public class Nicad_ant11
{
            public AntFTPFile(AntFTPFile parent, String path) {
                this.parent = parent;
                this.client = parent.client;
                List<String> pathElements = SelectorUtils.tokenizePath(path);
                try {
                    //this should not happen, except if parent has been deleted by another process
                    if (!this.client.changeWorkingDirectory(parent.getAbsolutePath())) {
                        return;
                    }
                    this.curpwd = parent.getAbsolutePath();
                } catch (IOException ioe) {
                    throw new BuildException(
                        "could not change working dir to %s", parent.curpwd);
                }
                for (String currentPathElement : pathElements) {
                    try {
                        if (!this.client
                            .changeWorkingDirectory(currentPathElement)) {
                            if (!isCaseSensitive() && (remoteSystemCaseSensitive
                                || !remoteSensitivityChecked)) {
                                currentPathElement =
                                    findPathElementCaseUnsensitive(this.curpwd,
                                        currentPathElement);
                                if (currentPathElement == null) {
                                    return;
                                }
                            }
                            return;
                        }
                        this.curpwd =
                            getCurpwdPlusFileSep() + currentPathElement;
                    } catch (IOException ioe) {
                        throw new BuildException(
                            "could not change working dir to %s from %s",
                            currentPathElement, curpwd);
                    }
                }
                String lastpathelement = pathElements.get(pathElements.size() - 1);
                FTPFile[] theFiles = listFiles(this.curpwd);
                this.ftpFile = getFile(theFiles, lastpathelement);
            }
}