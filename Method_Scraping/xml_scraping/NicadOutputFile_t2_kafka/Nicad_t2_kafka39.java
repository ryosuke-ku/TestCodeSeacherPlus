// clone pairs:611:100%
// 237:kafka/streams/src/main/java/org/apache/kafka/streams/kstream/internals/KTableKTableLeftJoin.java

public class Nicad_t2_kafka39
{
        public ValueAndTimestamp<R> get(final K key) {
            final ValueAndTimestamp<V1> valueAndTimestamp1 = valueGetter1.get(key);
            final V1 value1 = getValueOrNull(valueAndTimestamp1);

            if (value1 != null) {
                final ValueAndTimestamp<V2> valueAndTimestamp2 = valueGetter2.get(key);
                final V2 value2 = getValueOrNull(valueAndTimestamp2);
                final long resultTimestamp;
                if (valueAndTimestamp2 == null) {
                    resultTimestamp = valueAndTimestamp1.timestamp();
                } else {
                    resultTimestamp = Math.max(valueAndTimestamp1.timestamp(), valueAndTimestamp2.timestamp());
                }
                return ValueAndTimestamp.make(joiner.apply(value1, value2), resultTimestamp);
            } else {
                return null;
            }
        }
}