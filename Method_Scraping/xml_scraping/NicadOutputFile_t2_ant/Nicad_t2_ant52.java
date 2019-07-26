// clone pairs:686:70%
// 966:ant/src/main/org/apache/tools/ant/taskdefs/MacroDef.java

public class Nicad_t2_ant52
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