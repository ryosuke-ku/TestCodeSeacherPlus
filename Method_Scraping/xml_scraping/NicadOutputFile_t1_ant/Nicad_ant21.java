// clone pairs:90:76%
// 155:ant/src/main/org/apache/tools/ant/taskdefs/optional/net/FTP.java

public class Nicad_ant21
{
        private void checkIncludePatterns() {

            Map<String, String> newroots = new HashMap<>();
            // put in the newroots vector the include patterns without
            // wildcard tokens
            for (String include : includes) {
                String newpattern
                        = SelectorUtils.rtrimWildcardTokens(include);
                newroots.put(newpattern, include);
            }
            if (remotedir == null) {
                try {
                    remotedir = ftp.printWorkingDirectory();
                } catch (IOException e) {
                    throw new BuildException("could not read current ftp directory",
                                             getLocation());
                }
            }
            AntFTPFile baseFTPFile = new AntFTPRootFile(ftp, remotedir);
            rootPath = baseFTPFile.getAbsolutePath();
            // construct it
            if (newroots.containsKey("")) {
                // we are going to scan everything anyway
                scandir(rootPath, "", true);
            } else {
                // only scan directories that can include matched files or
                // directories
                newroots.forEach((k, v) -> scanRoots(baseFTPFile, k, v));
            }
        }
}