// clone pairs:696:80%
// 986:ant/src/main/org/apache/tools/ant/taskdefs/MacroDef.java

public class Nicad_t2_ant_76_807
{
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || !obj.getClass().equals(getClass())) {
                return false;
            }
            TemplateElement t = (TemplateElement) obj;
            return
                (name == null ? t.name == null : name.equals(t.name))
                && optional == t.optional
                && implicit == t.implicit;
        }
}