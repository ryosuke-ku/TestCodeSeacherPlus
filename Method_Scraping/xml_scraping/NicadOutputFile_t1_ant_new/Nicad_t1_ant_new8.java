// clone pairs:14:90%
// 21:ant/src/main/org/apache/tools/ant/taskdefs/optional/net/FTP.java

public class Nicad_t1_ant_new8
{
    protected void createParents(FTPClient ftp, String filename)
        throws IOException, BuildException {

        File dir = new File(filename);
        if (dirCache.contains(dir)) {
            return;
        }

        List<File> parents = new Vector<>();
        String dirname;

        while ((dirname = dir.getParent()) != null) {
            File checkDir = new File(dirname);
            if (dirCache.contains(checkDir)) {
                break;
            }
            dir = checkDir;
            parents.add(dir);
        }

        // find first non cached dir
        int i = parents.size() - 1;

        if (i >= 0) {
            String cwd = ftp.printWorkingDirectory();
            String parent = dir.getParent();
            if (parent != null
                && !ftp.changeWorkingDirectory(resolveFile(parent))) {
                throw new BuildException("could not change to directory: %s",
                    ftp.getReplyString());
            }

            while (i >= 0) {
                dir = parents.get(i--);
                // check if dir exists by trying to change into it.
                if (!ftp.changeWorkingDirectory(dir.getName())) {
                    // could not change to it - try to create it
                    log("creating remote directory "
                        + resolveFile(dir.getPath()), Project.MSG_VERBOSE);
                    if (!ftp.makeDirectory(dir.getName())) {
                        handleMkDirFailure(ftp);
                    }
                    if (!ftp.changeWorkingDirectory(dir.getName())) {
                        throw new BuildException(
                            "could not change to directory: %s",
                            ftp.getReplyString());
                    }
                }
                dirCache.add(dir);
            }
            ftp.changeWorkingDirectory(cwd);
        }
    }
}