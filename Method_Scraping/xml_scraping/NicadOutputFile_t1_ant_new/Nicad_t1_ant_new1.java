// clone pairs:3:87%
// 5:ant/src/main/org/apache/tools/ant/taskdefs/optional/net/FTP.java

public class Nicad_t1_ant_new1
{
        protected void scandir(String dir, String vpath, boolean fast) {
            // avoid double scanning of directories, can only happen in fast mode
            if (fast && hasBeenScanned(vpath)) {
                return;
            }
            try {
                if (!ftp.changeWorkingDirectory(dir)) {
                    return;
                }
                String completePath = null;
                if (!vpath.isEmpty()) {
                    completePath = rootPath + remoteFileSep
                        + vpath.replace(File.separatorChar, remoteFileSep.charAt(0));
                } else {
                    completePath = rootPath;
                }
                FTPFile[] newfiles = listFiles(completePath, false);

                if (newfiles == null) {
                    ftp.changeToParentDirectory();
                    return;
                }
                for (FTPFile file : newfiles) {
                    if (file != null
                            && !".".equals(file.getName())
                            && !"..".equals(file.getName())) {
                        String name = vpath + file.getName();
                        scannedDirs.put(name, new FTPFileProxy(file));
                        if (isFunctioningAsDirectory(ftp, dir, file)) {
                            boolean slowScanAllowed = true;
                            if (!isFollowSymlinks() && file.isSymbolicLink()) {
                                dirsExcluded.addElement(name);
                                slowScanAllowed = false;
                            } else if (isIncluded(name)) {
                                accountForIncludedDir(name,
                                        new AntFTPFile(ftp, file, completePath), fast);
                            } else {
                                dirsNotIncluded.addElement(name);
                                if (fast && couldHoldIncluded(name)) {
                                    scandir(file.getName(),
                                            name + File.separator, fast);
                                }
                            }
                            if (!fast && slowScanAllowed) {
                                scandir(file.getName(),
                                        name + File.separator, fast);
                            }
                        } else {
                            if (!isFollowSymlinks() && file.isSymbolicLink()) {
                                filesExcluded.addElement(name);
                            } else {
                                // at this point, it's either a symbolic link or a file, but not a directory.
                                // so we include it
                                accountForIncludedFile(name);
                            }
                        }
                    }
                }
                ftp.changeToParentDirectory();
            } catch (FTPConnectionClosedException ftpcce) {
                throw new BuildException("Error while communicating with FTP "
                                         + "server: ", ftpcce);
            } catch (IOException e) {
                throw new BuildException("Error while communicating with FTP "
                                         + "server: ", e);
            }
        }
}