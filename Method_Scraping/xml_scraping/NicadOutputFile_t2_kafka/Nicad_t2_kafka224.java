// clone pairs:2120:80%
// 2122:kafka/streams/src/main/java/org/apache/kafka/streams/kstream/internals/KStreamImpl.java

public class Nicad_t2_kafka224
{
    public <KR, VR> KStream<KR, VR> flatMap(final KeyValueMapper<? super K, ? super V, ? extends Iterable<? extends KeyValue<? extends KR, ? extends VR>>> mapper,
                                            final Named named) {
        Objects.requireNonNull(mapper, "mapper can't be null");
        Objects.requireNonNull(named, "named can't be null");
        final String name = new NamedInternal(named).orElseGenerateWithPrefix(builder, FLATMAP_NAME);
        final ProcessorParameters<? super K, ? super V> processorParameters = new ProcessorParameters<>(new KStreamFlatMap<>(mapper), name);
        final ProcessorGraphNode<? super K, ? super V> flatMapNode = new ProcessorGraphNode<>(name, processorParameters);
        flatMapNode.keyChangingOperation(true);

        builder.addGraphNode(this.streamsGraphNode, flatMapNode);

        // key and value serde cannot be preserved
        return new KStreamImpl<>(name, null, null, sourceNodes, true, flatMapNode, builder);
    }
}