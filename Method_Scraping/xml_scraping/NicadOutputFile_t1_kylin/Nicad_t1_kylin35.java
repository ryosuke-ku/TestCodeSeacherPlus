// clone pairs:341:75%
// 496:kylin/query/src/main/java/org/apache/kylin/query/util/QueryUtil.java

public class Nicad_t1_kylin35
{
    public static String makeErrorMsgUserFriendly(Throwable e) {
        String msg = e.getMessage();

        // pick ParseException error message if possible
        Throwable cause = e;
        while (cause != null) {
            if (cause.getClass().getName().contains("ParseException")) {
                msg = cause.getMessage();
                break;
            }

            if (cause.getClass().getName().contains("ArithmeticException")) {
                msg = "ArithmeticException: " + cause.getMessage();
                break;
            }
            cause = cause.getCause();
        }

        return makeErrorMsgUserFriendly(msg);
    }
}