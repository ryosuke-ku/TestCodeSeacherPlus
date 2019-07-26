// clone pairs:505:100%
// 813:ant/src/main/org/apache/tools/ant/taskdefs/optional/net/FTP.java

public class Nicad_t1_ant_new90
{
            public String getRelativePath() throws IOException, BuildException {
                if (!relativePathCalculated) {
                    if (parent != null) {
                        traversesSymlinks = parent.isTraverseSymlinks();
                        relativePath = getRelativePath(parent.getAbsolutePath(),
                                                       parent.getRelativePath());
                    } else {
                        relativePath = getRelativePath(rootPath, "");
                        relativePathCalculated = true;
                    }
                }
                return relativePath;
            }
}