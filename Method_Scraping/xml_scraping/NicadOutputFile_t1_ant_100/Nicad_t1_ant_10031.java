// clone pairs:689:90%
// 972:ant/src/main/org/apache/tools/ant/taskdefs/optional/net/FTP.java

public class Nicad_t1_ant_10031
{
            public AntFTPRootFile(FTPClient aclient, String remotedir) {
                super(aclient, null, remotedir);
                this.remotedir = remotedir;
                try {
                    this.getClient().changeWorkingDirectory(this.remotedir);
                    this.setCurpwd(this.getClient().printWorkingDirectory());
                } catch (IOException ioe) {
                    throw new BuildException(ioe, getLocation());
                }
            }
}