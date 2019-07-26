// clone pairs:255:70%
// 65:kafka/streams/src/main/java/org/apache/kafka/streams/kstream/internals/KTableKTableOuterJoin.java

public class Nicad_t2_kafka9
{
        public void process(final K key, final Change<V1> change) {
            // we do join iff keys are equal, thus, if key is null we cannot join and just ignore the record
            if (key == null) {
                LOG.warn(
                    "Skipping record due to null key. change=[{}] topic=[{}] partition=[{}] offset=[{}]",
                    change, context().topic(), context().partition(), context().offset()
                );
                skippedRecordsSensor.record();
                return;
            }

            R newValue = null;
            final long resultTimestamp;
            R oldValue = null;

            final ValueAndTimestamp<V2> valueAndTimestamp2 = valueGetter.get(key);
            final V2 value2 = getValueOrNull(valueAndTimestamp2);
            if (value2 == null) {
                if (change.newValue == null && change.oldValue == null) {
                    return;
                }
                resultTimestamp = context().timestamp();
            } else {
                resultTimestamp = Math.max(context().timestamp(), valueAndTimestamp2.timestamp());
            }

            if (value2 != null || change.newValue != null) {
                newValue = joiner.apply(change.newValue, value2);
            }

            if (sendOldValues && (value2 != null || change.oldValue != null)) {
                oldValue = joiner.apply(change.oldValue, value2);
            }

            context().forward(key, new Change<>(newValue, oldValue), To.all().withTimestamp(resultTimestamp));
        }
}