// clone pairs:400:78%
// 663:ant/src/main/org/apache/tools/ant/types/AbstractFileSet.java

public class Nicad_ant59
{
    public synchronized Object clone() {
        if (isReference()) {
            return (getRef(getProject())).clone();
        }
        try {
            AbstractFileSet fs = (AbstractFileSet) super.clone();
            fs.defaultPatterns = (PatternSet) defaultPatterns.clone();
            fs.additionalPatterns = additionalPatterns.stream().map(PatternSet::clone)
                    .map(PatternSet.class::cast).collect(Collectors.toList());
            fs.selectors = new ArrayList<>(selectors);
            return fs;
        } catch (CloneNotSupportedException e) {
            throw new BuildException(e);
        }
    }
}