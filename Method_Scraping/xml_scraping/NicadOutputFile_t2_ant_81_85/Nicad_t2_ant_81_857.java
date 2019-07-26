// clone pairs:510:83%
// 825:ant/src/main/org/apache/tools/ant/taskdefs/optional/vss/MSVSS.java

public class Nicad_t2_ant_81_857
{
    public String getFileTimeStamp() {
        if (timestamp == null) {
            return "";
        } else if (timestamp.getValue().equals(TIME_MODIFIED)) {
            return FLAG_FILETIME_MODIFIED;
        } else if (timestamp.getValue().equals(TIME_UPDATED)) {
            return FLAG_FILETIME_UPDATED;
        } else {
            return FLAG_FILETIME_DEF;
        }
    }
}