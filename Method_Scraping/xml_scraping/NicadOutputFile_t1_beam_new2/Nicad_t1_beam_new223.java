// clone pairs:809:86%
// 550:beam/runners/java-fn-execution/src/main/java/org/apache/beam/runners/fnexecution/translation/BatchSideInputHandlerFactory.java

public class Nicad_t1_beam_new223
{
  public <T, V, W extends BoundedWindow> SideInputHandler<V, W> forSideInput(
      String transformId,
      String sideInputId,
      RunnerApi.FunctionSpec accessPattern,
      Coder<T> elementCoder,
      Coder<W> windowCoder) {

    PCollectionNode collectionNode =
        sideInputToCollection.get(
            SideInputId.newBuilder().setTransformId(transformId).setLocalName(sideInputId).build());
    checkArgument(collectionNode != null, "No side input for %s/%s", transformId, sideInputId);

    if (PTransformTranslation.ITERABLE_SIDE_INPUT.equals(accessPattern.getUrn())) {
      @SuppressWarnings("unchecked") // T == V
      Coder<V> outputCoder = (Coder<V>) elementCoder;
      return forIterableSideInput(
          sideInputGetter.getSideInput(collectionNode.getId()), outputCoder, windowCoder);
    } else if (PTransformTranslation.MULTIMAP_SIDE_INPUT.equals(accessPattern.getUrn())) {
      @SuppressWarnings("unchecked") // T == KV<?, V>
      KvCoder<?, V> kvCoder = (KvCoder<?, V>) elementCoder;
      return forMultimapSideInput(
          sideInputGetter.getSideInput(collectionNode.getId()),
          kvCoder.getKeyCoder(),
          kvCoder.getValueCoder(),
          windowCoder);
    } else {
      throw new IllegalArgumentException(
          String.format("Unknown side input access pattern: %s", accessPattern));
    }
  }
}