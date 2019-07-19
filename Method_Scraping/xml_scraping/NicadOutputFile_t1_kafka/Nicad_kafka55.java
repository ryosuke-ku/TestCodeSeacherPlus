// clone pairs:1365:80%
// 711:kafka/clients/src/main/java/org/apache/kafka/common/record/ControlRecordType.java

public class Nicad_kafka55
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