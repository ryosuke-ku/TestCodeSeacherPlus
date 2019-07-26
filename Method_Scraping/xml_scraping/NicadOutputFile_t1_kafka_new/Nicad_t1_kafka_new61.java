// clone pairs:1365:80%
// 709:kafka/clients/src/main/java/org/apache/kafka/common/record/ControlRecordType.java

public class Nicad_t1_kafka_new61
{
    public static ControlRecordType fromTypeId(short typeId) {
        switch (typeId) {
            case 0:
                return ABORT;
            case 1:
                return COMMIT;
            default:
                return UNKNOWN;
        }
    }
}