// clone pairs:496:75%
// 797:ant/src/main/org/apache/tools/ant/taskdefs/Manifest.java

public class Nicad_t2_ant_71_754
{
        public boolean equals(Object rhs) {
            if (rhs == null || rhs.getClass() != getClass()) {
                return false;
            }

            if (rhs == this) {
                return true;
            }

            Attribute rhsAttribute = (Attribute) rhs;
            String lhsKey = getKey();
            String rhsKey = rhsAttribute.getKey();
            return (lhsKey != null || rhsKey == null)
                    && (lhsKey == null || lhsKey.equals(rhsKey)) && values.equals(rhsAttribute.values);
        }
}