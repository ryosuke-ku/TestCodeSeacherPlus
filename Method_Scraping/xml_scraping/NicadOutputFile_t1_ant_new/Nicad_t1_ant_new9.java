// clone pairs:20:100%
// 30:ant/src/main/org/apache/tools/ant/taskdefs/optional/net/FTP.java

public class Nicad_t1_ant_new9
{
        private void accountForIncludedDir(String name, AntFTPFile file, boolean fast) {
            if (!dirsIncluded.contains(name)
                && !dirsExcluded.contains(name)) {

                if (!isExcluded(name)) {
                    if (fast) {
                        if (file.isSymbolicLink()) {
                            try {
                                file.getClient().changeWorkingDirectory(file.curpwd);
                            } catch (IOException ioe) {
                                throw new BuildException("could not change directory to curpwd");
                            }
                            scandir(file.getLink(),
                                    name + File.separator, fast);
                        } else {
                            try {
                                file.getClient().changeWorkingDirectory(file.curpwd);
                            } catch (IOException ioe) {
                                throw new BuildException("could not change directory to curpwd");
                            }
                            scandir(file.getName(),
                                    name + File.separator, fast);
                        }
                    }
                    dirsIncluded.addElement(name);
                } else {
                    dirsExcluded.addElement(name);
                    if (fast && couldHoldIncluded(name)) {
                        try {
                            file.getClient().changeWorkingDirectory(file.curpwd);
                        } catch (IOException ioe) {
                            throw new BuildException("could not change directory to curpwd");
                        }
                        scandir(file.getName(),
                                name + File.separator, fast);
                    }
                }
            }
        }
}