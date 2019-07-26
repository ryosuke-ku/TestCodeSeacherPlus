// clone pairs:873:76%
// 381:kafka/streams/src/main/java/org/apache/kafka/streams/kstream/internals/KStreamImpl.java

public class Nicad_t2_kafka_76_8022
{
    public <VO, VR> KStream<K, VR> join(final KTable<K, VO> other,
                                        final ValueJoiner<? super V, ? super VO, ? extends VR> joiner,
                                        final Joined<K, V, VO> joined) {
        Objects.requireNonNull(other, "other can't be null");
        Objects.requireNonNull(joiner, "joiner can't be null");
        Objects.requireNonNull(joined, "joined can't be null");

        final JoinedInternal<K, V, VO> joinedInternal = new JoinedInternal<>(joined);
        final String name = joinedInternal.name();
        if (repartitionRequired) {
            final KStreamImpl<K, V> thisStreamRepartitioned = repartitionForJoin(
                name != null ? name : this.name,
                joined.keySerde(),
                joined.valueSerde()
            );
            return thisStreamRepartitioned.doStreamTableJoin(other, joiner, joined, false);
        } else {
            return doStreamTableJoin(other, joiner, joined, false);
        }
    }
}