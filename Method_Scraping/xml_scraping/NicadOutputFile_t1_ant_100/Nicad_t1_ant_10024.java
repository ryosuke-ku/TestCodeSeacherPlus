// clone pairs:531:100%
// 863:ant/src/main/org/apache/tools/ant/taskdefs/optional/net/FTP.java

public class Nicad_t1_ant_10024
{
        public long getMilliseconds(int action) {
            String granularityU = getValue().toUpperCase(Locale.ENGLISH);
            if (granularityU.isEmpty()) {
                if (action == SEND_FILES) {
                    return GRANULARITY_MINUTE;
                }
            } else if ("MINUTE".equals(granularityU)) {
                return GRANULARITY_MINUTE;
            }
            return 0L;
        }
}