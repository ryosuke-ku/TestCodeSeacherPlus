// clone pairs:2123:80%
// 2128:kafka/streams/src/main/java/org/apache/kafka/streams/kstream/internals/KStreamImpl.java

public class Nicad_t2_kafka227
{
    public <VR> KStream<K, VR> mapValues(final ValueMapperWithKey<? super K, ? super V, ? extends VR> mapper, final Named named) {
        Objects.requireNonNull(mapper, "mapper can't be null");
        Objects.requireNonNull(mapper, "named can't be null");
        final String name = new NamedInternal(named).orElseGenerateWithPrefix(builder, MAPVALUES_NAME);
        final ProcessorParameters<? super K, ? super V> processorParameters = new ProcessorParameters<>(new KStreamMapValues<>(mapper), name);
        final ProcessorGraphNode<? super K, ? super V> mapValuesProcessorNode = new ProcessorGraphNode<>(name, processorParameters);

        mapValuesProcessorNode.setValueChangingOperation(true);
        builder.addGraphNode(this.streamsGraphNode, mapValuesProcessorNode);

        // value serde cannot be preserved
        return new KStreamImpl<>(
                name,
                keySerde,
                null,
                sourceNodes,
                repartitionRequired,
                mapValuesProcessorNode,
                builder);
    }
}