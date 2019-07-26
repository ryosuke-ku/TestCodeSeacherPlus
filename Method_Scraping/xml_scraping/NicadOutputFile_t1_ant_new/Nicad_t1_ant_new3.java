// clone pairs:8:90%
// 11:ant/src/main/org/apache/tools/ant/taskdefs/optional/net/FTP.java

public class Nicad_t1_ant_new3
{
        private void checkRemoteSensitivity(FTPFile[] array, String directory) {
            if (array == null) {
                return;
            }
            boolean candidateFound = false;
            String target = null;
            for (int icounter = 0; icounter < array.length; icounter++) {
                if (array[icounter] != null && array[icounter].isDirectory()) {
                    if (!".".equals(array[icounter].getName())
                        && !"..".equals(array[icounter].getName())) {
                        candidateFound = true;
                        target = fiddleName(array[icounter].getName());
                        getProject().log("will try to cd to "
                                         + target + " where a directory called " + array[icounter].getName()
                                         + " exists", Project.MSG_DEBUG);
                        for (int pcounter = 0; pcounter < array.length; pcounter++) {
                            if (array[pcounter] != null
                                && pcounter != icounter
                                && target.equals(array[pcounter].getName())) {
                                candidateFound = false;
                                break;
                            }
                        }
                        if (candidateFound) {
                            break;
                        }
                    }
                }
            }
            if (candidateFound) {
                try {
                    getProject().log("testing case sensitivity, attempting to cd to "
                                     + target, Project.MSG_DEBUG);
                    remoteSystemCaseSensitive  = !ftp.changeWorkingDirectory(target);
                } catch (IOException ioe) {
                    remoteSystemCaseSensitive = true;
                } finally {
                    try {
                        ftp.changeWorkingDirectory(directory);
                    } catch (IOException ioe) {
                        throw new BuildException(ioe, getLocation()); //NOSONAR
                    }
                }
                getProject().log("remote system is case sensitive : " + remoteSystemCaseSensitive,
                                 Project.MSG_VERBOSE);
                remoteSensitivityChecked = true;
            }
        }
}