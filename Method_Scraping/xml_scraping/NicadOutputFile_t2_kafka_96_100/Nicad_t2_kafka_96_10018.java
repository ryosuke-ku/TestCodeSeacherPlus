// clone pairs:2146:100%
// 2174:kafka/streams/src/main/java/org/apache/kafka/streams/internals/ApiUtils.java

public class Nicad_t2_kafka_96_10018
{
    public static long validateMillisecondDuration(final Duration duration, final String messagePrefix) {
        try {
            if (duration == null) {
                throw new IllegalArgumentException(messagePrefix + VALIDATE_MILLISECOND_NULL_SUFFIX);
            }

            return duration.toMillis();
        } catch (final ArithmeticException e) {
            throw new IllegalArgumentException(messagePrefix + VALIDATE_MILLISECOND_OVERFLOW_SUFFIX, e);
        }
    }
}