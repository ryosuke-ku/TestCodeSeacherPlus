// clone pairs:1005:75%
// 442:kafka/streams/src/main/java/org/apache/kafka/streams/kstream/internals/KStreamWindowAggregate.java

public class Nicad_t1_kafka_new36
{
    public KTableValueGetterSupplier<Windowed<K>, Agg> view() {
        return new KTableValueGetterSupplier<Windowed<K>, Agg>() {

            public KTableValueGetter<Windowed<K>, Agg> get() {
                return new KStreamWindowAggregateValueGetter();
            }

            @Override
            public String[] storeNames() {
                return new String[] {storeName};
            }
        };
    }
}