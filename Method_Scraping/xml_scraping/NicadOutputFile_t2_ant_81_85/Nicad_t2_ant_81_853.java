// clone pairs:303:81%
// 501:ant/src/main/org/apache/tools/ant/util/GlobPatternMapper.java

public class Nicad_t2_ant_81_853
{
    public void setFrom(String from) {
        if (from == null) {
            throw new BuildException("this mapper requires a 'from' attribute");
        }
        int index = from.lastIndexOf('*');
        if (index < 0) {
            fromPrefix = from;
            fromPostfix = "";
        } else {
            fromPrefix = from.substring(0, index);
            fromPostfix = from.substring(index + 1);
            fromContainsStar = true;
        }
        prefixLength = fromPrefix.length();
        postfixLength = fromPostfix.length();
    }
}