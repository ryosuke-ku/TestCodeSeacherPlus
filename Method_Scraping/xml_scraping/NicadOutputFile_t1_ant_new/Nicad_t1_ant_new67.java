// clone pairs:413:100%
// 666:ant/src/main/org/apache/tools/ant/taskdefs/optional/net/FTP.java

public class Nicad_t1_ant_new67
{
        private String fiddleName(String origin) {
            StringBuilder result = new StringBuilder();
            for (char ch : origin.toCharArray()) {
                if (Character.isLowerCase(ch)) {
                    result.append(Character.toUpperCase(ch));
                } else if (Character.isUpperCase(ch)) {
                    result.append(Character.toLowerCase(ch));
                } else {
                    result.append(ch);
                }
            }
            return result.toString();
        }
}