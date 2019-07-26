// clone pairs:1038:100%
// 507:kafka/streams/src/main/java/org/apache/kafka/streams/state/internals/RocksDBTimestampedStore.java

public class Nicad_t1_kafka_1006
{
        public KeyValue<Bytes, byte[]> makeNext() {
            final KeyValue<Bytes, byte[]> next = super.makeNext();

            if (next == null) {
                return allDone();
            } else {
                if (comparator.compare(next.key.get(), upperBoundKey) <= 0) {
                    return next;
                } else {
                    return allDone();
                }
            }
        }
}