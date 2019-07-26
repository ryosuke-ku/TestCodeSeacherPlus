// clone pairs:319:75%
// 101:kafka/streams/test-utils/src/main/java/org/apache/kafka/streams/test/OutputVerifier.java

public class Nicad_t2_kafka17
{
    public static <K, V> void compareKeyValue(final ProducerRecord<K, V> record,
                                              final K expectedKey,
                                              final V expectedValue) throws AssertionError {
        Objects.requireNonNull(record);

        final K recordKey = record.key();
        final V recordValue = record.value();
        final AssertionError error = new AssertionError("Expected <" + expectedKey + ", " + expectedValue + "> " +
            "but was <" + recordKey + ", " + recordValue + ">");

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
    }
}