// clone pairs:675:80%
// 945:ant/src/main/org/apache/tools/ant/types/RedirectorElement.java

public class Nicad_t2_ant_76_805
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