// clone pairs:874:92%
// 384:kafka/streams/src/main/java/org/apache/kafka/streams/kstream/internals/KStreamWindowAggregate.java

public class Nicad_kafka31
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