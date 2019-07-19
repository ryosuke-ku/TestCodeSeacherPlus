// clone pairs:441:92%
// 724:ant/src/main/org/apache/tools/ant/taskdefs/Touch.java

public class Nicad_ant65
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