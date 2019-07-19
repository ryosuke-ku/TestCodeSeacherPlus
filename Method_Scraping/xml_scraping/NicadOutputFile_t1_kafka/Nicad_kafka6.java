// clone pairs:318:95%
// 99:kafka/streams/test-utils/src/main/java/org/apache/kafka/streams/test/OutputVerifier.java

public class Nicad_kafka6
{
    public static <K, V> void compareKeyValueTimestamp(final ProducerRecord<K, V> record,
                                                       final K expectedKey,
                                                       final V expectedValue,
                                                       final long expectedTimestamp) throws AssertionError {
        Objects.requireNonNull(record);

        final K recordKey = record.key();
        final V recordValue = record.value();
        final long recordTimestamp = record.timestamp();
        final AssertionError error = new AssertionError("Expected <" + expectedKey + ", " + expectedValue + "> with timestamp=" + expectedTimestamp +
            " but was <" + recordKey + ", " + recordValue + "> with timestamp=" + recordTimestamp);

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

        if (recordTimestamp != expectedTimestamp) {
            throw error;
        }
    }
}