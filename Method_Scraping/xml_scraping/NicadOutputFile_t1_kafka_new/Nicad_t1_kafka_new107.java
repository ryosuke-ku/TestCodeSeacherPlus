// clone pairs:1537:70%
// 954:kafka/clients/src/main/java/org/apache/kafka/common/header/internals/RecordHeaders.java

public class Nicad_t1_kafka_new107
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