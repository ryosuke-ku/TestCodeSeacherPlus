// clone pairs:441:92%
// 724:ant/src/main/org/apache/tools/ant/taskdefs/Touch.java

public class Nicad_t1_ant_10018
{
    public void setPattern(final String pattern) {
        dfFactory = new DateFormatFactory() {
            @Override
            public DateFormat getPrimaryFormat() {
                return new SimpleDateFormat(pattern);
            }
            @Override
            public DateFormat getFallbackFormat() {
                return null;
            }
        };
    }
}