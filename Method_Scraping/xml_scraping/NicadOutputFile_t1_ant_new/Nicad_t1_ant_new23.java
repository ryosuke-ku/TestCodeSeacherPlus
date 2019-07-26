// clone pairs:133:94%
// 214:ant/src/main/org/apache/tools/ant/types/selectors/FilenameSelector.java

public class Nicad_t1_ant_new23
{
    public void setParameters(Parameter... parameters) {
        super.setParameters(parameters);
        if (parameters != null) {
            for (Parameter parameter : parameters) {
                String paramname = parameter.getName();
                if (NAME_KEY.equalsIgnoreCase(paramname)) {
                    setName(parameter.getValue());
                } else if (CASE_KEY.equalsIgnoreCase(paramname)) {
                    setCasesensitive(Project.toBoolean(
                            parameter.getValue()));
                } else if (NEGATE_KEY.equalsIgnoreCase(paramname)) {
                    setNegate(Project.toBoolean(parameter.getValue()));
                } else if (REGEX_KEY.equalsIgnoreCase(paramname)) {
                    setRegex(parameter.getValue());
                } else {
                    setError("Invalid parameter " + paramname);
                }
            }
        }
    }
}