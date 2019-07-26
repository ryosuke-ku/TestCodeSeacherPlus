// clone pairs:492:84%
// 191:kafka/streams/src/main/java/org/apache/kafka/streams/processor/internals/StreamsMetadataState.java

public class Nicad_t2_kafka_81_855
{
    public synchronized <K> StreamsMetadata getMetadataWithKey(final String storeName,
                                                               final K key,
                                                               final Serializer<K> keySerializer) {
        Objects.requireNonNull(keySerializer, "keySerializer can't be null");
        Objects.requireNonNull(storeName, "storeName can't be null");
        Objects.requireNonNull(key, "key can't be null");

        if (!isInitialized()) {
            return StreamsMetadata.NOT_AVAILABLE;
        }

        if (globalStores.contains(storeName)) {
            // global stores are on every node. if we dont' have the host info
            // for this host then just pick the first metadata
            if (thisHost == UNKNOWN_HOST) {
                return allMetadata.get(0);
            }
            return myMetadata;
        }

        final SourceTopicsInfo sourceTopicsInfo = getSourceTopicsInfo(storeName);
        if (sourceTopicsInfo == null) {
            return null;
        }

        return getStreamsMetadataForKey(storeName,
                                        key,
                                        new DefaultStreamPartitioner<>(keySerializer, clusterMetadata),
                                        sourceTopicsInfo);
    }
}