// clone pairs:982:75%
// 426:kafka/clients/src/main/java/org/apache/kafka/common/header/internals/RecordHeaders.java

public class Nicad_t2_kafka_71_7518
{
    public Headers remove(String key) throws IllegalStateException {
        canWrite();
        checkKey(key);
        Iterator<Header> iterator = iterator();
        while (iterator.hasNext()) {
            if (iterator.next().key().equals(key)) {
                iterator.remove();
            }
        }
        return this;
    }
}