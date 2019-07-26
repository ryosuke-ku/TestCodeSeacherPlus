// clone pairs:111:81%
// 17:kafka/streams/test-utils/src/main/java/org/apache/kafka/streams/test/OutputVerifier.java

public class Nicad_t2_kafka_81_851
{
    public static <K, V> void compareKeyValueHeaders(final ProducerRecord<K, V> record,
                                                     final K expectedKey,
                                                     final V expectedValue,
                                                     final Headers expectedHeaders) throws AssertionError {
        Objects.requireNonNull(record);

        final K recordKey = record.key();
        final V recordValue = record.value();
        final Headers recordHeaders = record.headers();
        final AssertionError error = new AssertionError("Expected <" + expectedKey + ", " + expectedValue + "> with headers=" + expectedHeaders +
                " but was <" + recordKey + ", " + recordValue + "> with headers=" + recordHeaders);

        if (recordKey != null) {
            if (!recordKey.equals(expectedKey)) {
                throw error;
            }
        } else if (expectedKey != null) {
            throw error;
        }

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