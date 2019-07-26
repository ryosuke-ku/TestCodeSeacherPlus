// clone pairs:13:80%
// 19:ant/src/main/org/apache/tools/ant/taskdefs/optional/net/FTP.java

public class Nicad_t1_ant_new7
{
    protected void getFile(FTPClient ftp, String dir, String filename)
        throws IOException, BuildException {
        File file = getProject().resolveFile(new File(dir, filename).getPath());
        OutputStream outstream = null;
        try {
            if (newerOnly && isUpToDate(ftp, file, resolveFile(filename))) {
                return;
            }

            if (verbose) {
                log("transferring " + filename + " to "
                    + file.getAbsolutePath());
            }

            File pdir = file.getParentFile();

            if (!pdir.exists()) {
                pdir.mkdirs();
            }
            outstream = new BufferedOutputStream(Files.newOutputStream(file.toPath()));
            ftp.retrieveFile(resolveFile(filename), outstream);

            if (!FTPReply.isPositiveCompletion(ftp.getReplyCode())) {
                String s = "could not get file: " + ftp.getReplyString();

                if (skipFailedTransfers) {
                    log(s, Project.MSG_WARN);
                    skipped++;
                } else {
                    throw new BuildException(s);
                }

            } else {
                log("File " + file.getAbsolutePath() + " copied from "
                    + server, Project.MSG_VERBOSE);
                transferred++;
                if (preserveLastModified) {
                    outstream.close();
                    outstream = null;
                    FTPFile[] remote = ftp.listFiles(resolveFile(filename));
                    if (remote.length > 0) {
                        FILE_UTILS.setFileLastModified(file,
                                                       remote[0].getTimestamp()
                                                       .getTime().getTime());
                    }
                }
            }
        } finally {
            FileUtils.close(outstream);
        }
    }
}