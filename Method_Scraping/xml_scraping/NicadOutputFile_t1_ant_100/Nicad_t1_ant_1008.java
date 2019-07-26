// clone pairs:38:92%
// 66:ant/src/main/org/apache/tools/ant/taskdefs/optional/net/FTP.java

public class Nicad_t1_ant_1008
{
        public int getAction() {
            switch (getValue().toLowerCase(Locale.ENGLISH)) {
            case "send":
            case "put":
                return SEND_FILES;
            case "recv":
            case "get":
                return GET_FILES;
            case "del":
            case "delete":
                return DEL_FILES;
            case "list":
                return LIST_FILES;
            case "chmod":
                return CHMOD;
            case "mkdir":
                return MK_DIR;
            case "rmdir":
                return RM_DIR;
            case "site":
                return SITE_CMD;
            }
            return SEND_FILES;
        }
}