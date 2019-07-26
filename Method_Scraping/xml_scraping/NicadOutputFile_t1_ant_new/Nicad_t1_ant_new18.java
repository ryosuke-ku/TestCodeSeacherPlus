// clone pairs:47:100%
// 81:ant/src/main/org/apache/tools/ant/taskdefs/optional/net/FTP.java

public class Nicad_t1_ant_new18
{
        public void scan() {
            if (includes == null) {
                // No includes supplied, so set it to 'matches all'
                includes = new String[1];
                includes[0] = "**";
            }
            if (excludes == null) {
                excludes = new String[0];
            }

            filesIncluded = new VectorSet<>();
            filesNotIncluded = new Vector<>();
            filesExcluded = new VectorSet<>();
            dirsIncluded = new VectorSet<>();
            dirsNotIncluded = new Vector<>();
            dirsExcluded = new VectorSet<>();

            try {
                String cwd = ftp.printWorkingDirectory();
                // always start from the current ftp working dir
                forceRemoteSensitivityCheck();

                checkIncludePatterns();
                clearCaches();
                ftp.changeWorkingDirectory(cwd);
            } catch (IOException e) {
                throw new BuildException("Unable to scan FTP server: ", e);
            }
        }
}