// clone pairs:875:76%
// 385:kafka/streams/src/main/java/org/apache/kafka/streams/kstream/internals/KTableMapValues.java

public class Nicad_t2_kafka_76_8023
{
        public void process(final K key, final Change<V> change) {
            final V1 newValue = computeValue(key, change.newValue);
            final V1 oldValue = sendOldValues ? computeValue(key, change.oldValue) : null;

            if (queryableName != null) {
                store.put(key, ValueAndTimestamp.make(newValue, context().timestamp()));
                tupleForwarder.maybeForward(key, newValue, oldValue);
            } else {
                context().forward(key, new Change<>(newValue, oldValue));
            }
        }
}