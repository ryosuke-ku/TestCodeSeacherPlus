// clone pairs:880:76%
// 395:kafka/streams/src/main/java/org/apache/kafka/streams/state/internals/RocksDBTimestampedStore.java

public class Nicad_t2_kafka72
{
        public byte[] get(final byte[] key) throws RocksDBException {
            final byte[] valueWithTimestamp = db.get(newColumnFamily, key);
            if (valueWithTimestamp != null) {
                return valueWithTimestamp;
            }

            final byte[] plainValue = db.get(oldColumnFamily, key);
            if (plainValue != null) {
                final byte[] valueWithUnknownTimestamp = convertToTimestampedFormat(plainValue);
                // this does only work, because the changelog topic contains correct data already
                // for other format changes, we cannot take this short cut and can only migrate data
                // from old to new store on put()
                put(key, valueWithUnknownTimestamp);
                return valueWithUnknownTimestamp;
            }

            return null;
        }
}