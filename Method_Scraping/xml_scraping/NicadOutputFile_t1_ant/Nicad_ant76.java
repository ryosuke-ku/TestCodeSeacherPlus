// clone pairs:504:100%
// 813:ant/src/main/org/apache/tools/ant/taskdefs/optional/net/FTP.java

public class Nicad_ant76
{
            private String findPathElementCaseUnsensitive(String parentPath,
                                                          String soughtPathElement) {
                // we are already in the right path, so the second parameter
                // is false
                FTPFile[] files = listFiles(parentPath, false);
                if (files == null) {
                    return null;
                }
                for (FTPFile file : files) {
                    if (file != null
                        && file.getName().equalsIgnoreCase(soughtPathElement)) {
                        return file.getName();
                    }
                }
                return null;
            }
}