// clone pairs:610:82%
// 235:kafka/streams/src/main/java/org/apache/kafka/streams/kstream/internals/KTableMapValues.java

public class Nicad_t2_kafka_81_856
{
    public KTableValueGetterSupplier<K, V1> view() {
        // if the KTable is materialized, use the materialized store to return getter value;
        // otherwise rely on the parent getter and apply map-values on-the-fly
        if (queryableName != null) {
            return new KTableMaterializedValueGetterSupplier<>(queryableName);
        } else {
            return new KTableValueGetterSupplier<K, V1>() {
                final KTableValueGetterSupplier<K, V> parentValueGetterSupplier = parent.valueGetterSupplier();

                public KTableValueGetter<K, V1> get() {
                    return new KTableMapValuesValueGetter(parentValueGetterSupplier.get());
                }

                @Override
                public String[] storeNames() {
                    return parentValueGetterSupplier.storeNames();
                }
            };
        }
    }
}