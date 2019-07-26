// clone pairs:2840:90%
// 1112:logging-log4j2/log4j-api/src/main/java/org/apache/logging/log4j/message/ParameterFormatter.java

public class Nicad_t1_logging116
{
    static void recursiveDeepToString(final Object o, final StringBuilder str, final Set<String> dejaVu) {
        if (appendSpecialTypes(o, str)) {
            return;
        }
        if (isMaybeRecursive(o)) {
            appendPotentiallyRecursiveValue(o, str, dejaVu);
        } else {
            tryObjectToString(o, str);
        }
    }
}