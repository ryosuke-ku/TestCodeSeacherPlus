// clone pairs:674:90%
// 943:ant/src/main/org/apache/tools/ant/types/RedirectorElement.java

public class Nicad_t2_ant_86_907
{
    public void setOutput(File out) {
        if (isReference()) {
            throw tooManyAttributes();
        }
        if (out == null) {
            throw new IllegalArgumentException("output file specified as null");
        }
        usingOutput = true;
        outputMapper = createMergeMapper(out);
    }
}