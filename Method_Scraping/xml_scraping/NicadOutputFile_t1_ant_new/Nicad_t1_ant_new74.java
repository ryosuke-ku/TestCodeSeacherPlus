// clone pairs:441:92%
// 722:ant/src/main/org/apache/tools/ant/taskdefs/Touch.java

public class Nicad_t1_ant_new74
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