// clone pairs:386:85%
// 638:ant/src/main/org/apache/tools/ant/types/RedirectorElement.java

public class Nicad_t2_ant21
{
    public void addConfiguredInputMapper(Mapper inputMapper) {
        if (isReference()) {
            throw noChildrenAllowed();
        }
        if (this.inputMapper != null) {
            if (usingInput) {
                throw new BuildException("attribute \"input\""
                    + " cannot coexist with a nested <inputmapper>");
            } else {
                throw new BuildException("Cannot have > 1 <inputmapper>");
            }
        }
        setChecked(false);
        this.inputMapper = inputMapper;
    }
}