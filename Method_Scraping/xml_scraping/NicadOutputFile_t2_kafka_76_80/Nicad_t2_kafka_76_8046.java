// clone pairs:2122:80%
// 2126:kafka/streams/src/main/java/org/apache/kafka/streams/kstream/internals/KStreamImpl.java

public class Nicad_t2_kafka_76_8046
{
    public <KR, VR> KStream<KR, VR> map(final KeyValueMapper<? super K, ? super V, ? extends KeyValue<? extends KR, ? extends VR>> mapper, final Named named) {
        Objects.requireNonNull(mapper, "mapper can't be null");
        Objects.requireNonNull(named, "named can't be null");
        final String name = new NamedInternal(named).orElseGenerateWithPrefix(builder, MAP_NAME);
        final ProcessorParameters<? super K, ? super V> processorParameters = new ProcessorParameters<>(new KStreamMap<>(mapper), name);

        final ProcessorGraphNode<? super K, ? super V> mapProcessorNode = new ProcessorGraphNode<>(name, processorParameters);

        mapProcessorNode.keyChangingOperation(true);
        builder.addGraphNode(this.streamsGraphNode, mapProcessorNode);

        // key and value serde cannot be preserved
        return new KStreamImpl<>(
                name,
                null,
                null,
                sourceNodes,
                true,
                mapProcessorNode,
                builder);
    }
}