// clone pairs:2839:100%
// 1110:logging-log4j2/log4j-api/src/main/java/org/apache/logging/log4j/message/ParameterFormatter.java

public class Nicad_t1_logging115
{
    private static void appendPotentiallyRecursiveValue(final Object o, final StringBuilder str,
            final Set<String> dejaVu) {
        final Class<?> oClass = o.getClass();
        if (oClass.isArray()) {
            appendArray(o, str, dejaVu, oClass);
        } else if (o instanceof Map) {
            appendMap(o, str, dejaVu);
        } else if (o instanceof Collection) {
            appendCollection(o, str, dejaVu);
        }
    }
}