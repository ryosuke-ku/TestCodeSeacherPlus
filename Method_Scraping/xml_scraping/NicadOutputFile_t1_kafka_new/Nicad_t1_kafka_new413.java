// clone pairs:2204:90%
// 2242:kafka/clients/src/main/java/org/apache/kafka/common/header/internals/RecordHeaders.java

public class Nicad_t1_kafka_new413
{
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        RecordHeaders headers1 = (RecordHeaders) o;

        return Objects.equals(headers, headers1.headers);
    }
}