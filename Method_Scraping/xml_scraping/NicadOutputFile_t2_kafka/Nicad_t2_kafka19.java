// clone pairs:400:82%
// 141:kafka/streams/src/main/java/org/apache/kafka/streams/kstream/internals/KTableKTableInnerJoin.java

public class Nicad_t2_kafka19
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

            final ValueAndTimestamp<V2> valueAndTimestampRight = valueGetter.get(key);
            final V2 valueRight = getValueOrNull(valueAndTimestampRight);
            if (valueRight == null) {
                return;
            }

            resultTimestamp = Math.max(context().timestamp(), valueAndTimestampRight.timestamp());

            if (change.newValue != null) {
                newValue = joiner.apply(change.newValue, valueRight);
            }

            if (sendOldValues && change.oldValue != null) {
                oldValue = joiner.apply(change.oldValue, valueRight);
            }

            context().forward(key, new Change<>(newValue, oldValue), To.all().withTimestamp(resultTimestamp));
        }
}