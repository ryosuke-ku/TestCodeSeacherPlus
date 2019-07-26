// clone pairs:7:90%
// 9:ant/src/main/org/apache/tools/ant/taskdefs/optional/net/FTP.java

public class Nicad_t1_ant_new2
{
        private void scanRoots(AntFTPFile baseFTPFile, String currentelement, String originalpattern) {
            AntFTPFile myfile = new AntFTPFile(baseFTPFile, currentelement);
            boolean isOK = true;
            boolean traversesSymlinks = false;
            String path = null;

            if (myfile.exists()) {
                forceRemoteSensitivityCheck();
                if (remoteSensitivityChecked
                    && remoteSystemCaseSensitive && isFollowSymlinks()) {
                    // cool case,
                    //we do not need to scan all the subdirs in the relative path
                    path = myfile.getFastRelativePath();
                } else {
                    // may be on a case insensitive file system.  We want
                    // the results to show what's really on the disk, so
                    // we need to double check.
                    try {
                        path = myfile.getRelativePath();
                        traversesSymlinks = myfile.isTraverseSymlinks();
                    } catch (IOException be) {
                        throw new BuildException(be, getLocation());
                    } catch (BuildException be) {
                        isOK = false;
                    }
                }
            } else {
                isOK = false;
            }
            if (isOK) {
                currentelement = path.replace(remoteFileSep.charAt(0), File.separatorChar);
                if (!isFollowSymlinks() && traversesSymlinks) {
                    return;
                }

                if (myfile.isDirectory()) {
                    if (isIncluded(currentelement) && !currentelement.isEmpty()) {
                        accountForIncludedDir(currentelement, myfile, true);
                    } else {
                        if (!currentelement.isEmpty()
                                && currentelement.charAt(currentelement.length() - 1)
                                != File.separatorChar) {
                            currentelement += File.separatorChar;
                        }
                        scandir(myfile.getAbsolutePath(), currentelement, true);
                    }
                } else if (isCaseSensitive && originalpattern.equals(currentelement)) {
                    accountForIncludedFile(currentelement);
                } else if (!isCaseSensitive && originalpattern.equalsIgnoreCase(currentelement)) {
                    accountForIncludedFile(currentelement);
                }
            }
        }
}