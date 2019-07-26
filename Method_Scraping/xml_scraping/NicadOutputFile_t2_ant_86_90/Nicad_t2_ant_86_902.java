// clone pairs:146:89%
// 223:ant/src/main/org/apache/tools/ant/types/selectors/ContainsSelector.java

public class Nicad_t2_ant_86_902
{
    public void setParameters(Parameter... parameters) {
        super.setParameters(parameters);
        if (parameters != null) {
            for (Parameter parameter : parameters) {
                String paramname = parameter.getName();
                if (CONTAINS_KEY.equalsIgnoreCase(paramname)) {
                    setText(parameter.getValue());
                } else if (CASE_KEY.equalsIgnoreCase(paramname)) {
                    setCasesensitive(Project.toBoolean(
                            parameter.getValue()));
                } else if (WHITESPACE_KEY.equalsIgnoreCase(paramname)) {
                    setIgnorewhitespace(Project.toBoolean(
                            parameter.getValue()));
                } else {
                    setError("Invalid parameter " + paramname);
                }
            }
        }
    }
}