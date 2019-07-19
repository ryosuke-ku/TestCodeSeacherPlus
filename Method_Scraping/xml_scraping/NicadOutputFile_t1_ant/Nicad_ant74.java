// clone pairs:497:75%
// 800:ant/src/main/org/apache/tools/ant/types/PatternSet.java

public class Nicad_ant74
{
    public Object clone() {
        try {
            PatternSet ps = (PatternSet) super.clone();
            ps.includeList = new ArrayList<>(includeList);
            ps.excludeList = new ArrayList<>(excludeList);
            ps.includesFileList = new ArrayList<>(includesFileList);
            ps.excludesFileList = new ArrayList<>(excludesFileList);
            return ps;
        } catch (CloneNotSupportedException e) {
            throw new BuildException(e);
        }
    }
}