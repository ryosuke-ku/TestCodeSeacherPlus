// clone pairs:532:72%
// 864:ant/src/main/org/apache/tools/ant/types/selectors/PosixGroupSelector.java

public class Nicad_t2_ant36
{
    public boolean isSelected(File basedir, String filename, File file) {
        if (group == null) {
            throw new BuildException("the group attribute is required");
        }
        try {
            GroupPrincipal actualGroup = followSymlinks ? Files.readAttributes(file.toPath(),
                    PosixFileAttributes.class).group() : Files.readAttributes(file.toPath(),
                    PosixFileAttributes.class, LinkOption.NOFOLLOW_LINKS).group();
            return actualGroup != null && actualGroup.getName().equals(group);
        } catch (IOException e) {
            // => not the expected group
        }
        return false;
    }
}