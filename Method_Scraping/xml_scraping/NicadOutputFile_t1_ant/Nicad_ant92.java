// clone pairs:665:70%
// 927:ant/src/main/org/apache/tools/ant/types/RedirectorElement.java

public class Nicad_ant92
{
    public void setError(File error) {
        if (isReference()) {
            throw tooManyAttributes();
        }
        if (error == null) {
            throw new IllegalArgumentException("error file specified as null");
        }
        usingError = true;
        errorMapper = createMergeMapper(error);
    }
}