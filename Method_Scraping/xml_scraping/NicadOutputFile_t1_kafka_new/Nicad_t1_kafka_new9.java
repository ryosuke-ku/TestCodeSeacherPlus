// clone pairs:341:75%
// 121:kafka/streams/test-utils/src/main/java/org/apache/kafka/streams/test/OutputVerifier.java

public class Nicad_t1_kafka_new9
{
    public static <K, V> void compareValueHeaders(final ProducerRecord<K, V> record,
                                                  final V expectedValue,
                                                  final Headers expectedHeaders) throws AssertionError {
        Objects.requireNonNull(record);

        final V recordValue = record.value();
        final Headers recordHeaders = record.headers();
        final AssertionError error = new AssertionError("Expected value=" + expectedValue + " with headers=" + expectedHeaders +
                " but was value=" + recordValue + " with headers=" + recordHeaders);

        if (recordValue != null) {
            if (!recordValue.equals(expectedValue)) {
                throw error;
            }
        } else if (expectedValue != null) {
            throw error;
        }

        if (recordHeaders != null) {
            if (!recordHeaders.equals(expectedHeaders)) {
                throw error;
            }
        } else if (expectedHeaders != null) {
            throw error;
        }
    }
}