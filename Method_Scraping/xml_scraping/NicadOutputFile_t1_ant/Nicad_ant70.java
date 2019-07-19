// clone pairs:482:75%
// 776:ant/src/main/org/apache/tools/ant/filters/LineContains.java

public class Nicad_ant70
{
    private void initialize() {
        Parameter[] params = getParameters();
        if (params != null) {
            for (Parameter param : params) {
                if (CONTAINS_KEY.equals(param.getType())) {
                    contains.addElement(param.getValue());
                } else if (NEGATE_KEY.equals(param.getType())) {
                    setNegate(Project.toBoolean(param.getValue()));
                }
            }
        }
    }
}