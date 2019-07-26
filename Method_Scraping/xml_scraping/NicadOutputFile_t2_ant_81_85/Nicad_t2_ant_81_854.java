// clone pairs:385:85%
// 636:ant/src/main/org/apache/tools/ant/types/RedirectorElement.java

public class Nicad_t2_ant_81_854
{
    public void addConfiguredOutputMapper(Mapper outputMapper) {
        if (isReference()) {
            throw noChildrenAllowed();
        }
        if (this.outputMapper != null) {
            if (usingOutput) {
                throw new BuildException("attribute \"output\""
                    + " cannot coexist with a nested <outputmapper>");
            } else {
                throw new BuildException("Cannot have > 1 <outputmapper>");
            }
        }
        setChecked(false);
        this.outputMapper = outputMapper;
    }
}