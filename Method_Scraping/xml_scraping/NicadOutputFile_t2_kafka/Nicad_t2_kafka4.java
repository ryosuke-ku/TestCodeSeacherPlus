// clone pairs:115:71%
// 25:kafka/streams/src/main/java/org/apache/kafka/streams/kstream/internals/KTableAggregate.java

public class Nicad_t2_kafka4
{
        public void process(final K key, final Change<V> value) {
            // the keys should never be null
            if (key == null) {
                throw new StreamsException("Record key for KTable aggregate operator with state " + storeName + " should not be null.");
            }

            final ValueAndTimestamp<T> oldAggAndTimestamp = store.get(key);
            final T oldAgg = getValueOrNull(oldAggAndTimestamp);
            final T intermediateAgg;
            long newTimestamp = context().timestamp();

            // first try to remove the old value
            if (value.oldValue != null && oldAgg != null) {
                intermediateAgg = remove.apply(key, value.oldValue, oldAgg);
                newTimestamp = Math.max(context().timestamp(), oldAggAndTimestamp.timestamp());
            } else {
                intermediateAgg = oldAgg;
            }

            // then try to add the new value
            final T newAgg;
            if (value.newValue != null) {
                final T initializedAgg;
                if (intermediateAgg == null) {
                    initializedAgg = initializer.apply();
                } else {
                    initializedAgg = intermediateAgg;
                }

                newAgg = add.apply(key, value.newValue, initializedAgg);
                if (oldAggAndTimestamp != null) {
                    newTimestamp = Math.max(context().timestamp(), oldAggAndTimestamp.timestamp());
                }
            } else {
                newAgg = intermediateAgg;
            }

            // update the store with the new value
            store.put(key, ValueAndTimestamp.make(newAgg, newTimestamp));
            tupleForwarder.maybeForward(key, newAgg, sendOldValues ? oldAgg : null, newTimestamp);
        }
}