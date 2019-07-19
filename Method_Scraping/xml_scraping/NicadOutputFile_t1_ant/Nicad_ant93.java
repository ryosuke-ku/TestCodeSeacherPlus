// clone pairs:666:70%
// 929:ant/src/main/org/apache/tools/ant/types/RedirectorElement.java

public class Nicad_ant93
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