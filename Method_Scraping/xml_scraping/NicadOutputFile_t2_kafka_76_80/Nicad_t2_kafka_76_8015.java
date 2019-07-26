// clone pairs:812:78%
// 334:kafka/streams/src/main/java/org/apache/kafka/streams/state/internals/WindowKeySchema.java

public class Nicad_t2_kafka_76_8015
{
    public HasNextCondition hasNextCondition(final Bytes binaryKeyFrom,
                                             final Bytes binaryKeyTo,
                                             final long from,
                                             final long to) {
        return iterator -> {
            while (iterator.hasNext()) {
                final Bytes bytes = iterator.peekNextKey();
                final Bytes keyBytes = Bytes.wrap(WindowKeySchema.extractStoreKeyBytes(bytes.get()));
                final long time = WindowKeySchema.extractStoreTimestamp(bytes.get());
                if ((binaryKeyFrom == null || keyBytes.compareTo(binaryKeyFrom) >= 0)
                    && (binaryKeyTo == null || keyBytes.compareTo(binaryKeyTo) <= 0)
                    && time >= from
                    && time <= to) {
                    return true;
                }
                iterator.next();
            }
            return false;
        };
    }
}