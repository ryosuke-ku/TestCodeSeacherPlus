// clone pairs:236:88%
// 371:ant/src/main/org/apache/tools/ant/filters/TokenFilter.java

public class Nicad_t2_ant12
{
        private void initialize() {
            if (initialized) {
                return;
            }
            options = convertRegexOptions(flags);
            if (from == null) {
                throw new BuildException("Missing pattern in replaceregex");
            }
            regularExpression = new RegularExpression();
            regularExpression.setPattern(from);
            regexp = regularExpression.getRegexp(getProject());
            if (to == null) {
                to = "";
            }
            substitution = new Substitution();
            substitution.setExpression(to);
        }
}