// clone pairs:676:80%
// 947:ant/src/main/org/apache/tools/ant/types/RedirectorElement.java

public class Nicad_t2_ant_76_806
{
    public void setInput(File input) {
        if (isReference()) {
            throw tooManyAttributes();
        }
        if (inputString != null) {
            throw new BuildException("The \"input\" and \"inputstring\" "
                + "attributes cannot both be specified");
        }
        usingInput = true;
        inputMapper = createMergeMapper(input);
    }
}