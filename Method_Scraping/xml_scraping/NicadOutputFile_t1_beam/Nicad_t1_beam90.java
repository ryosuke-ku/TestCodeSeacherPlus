// clone pairs:1525:75%
// 1447:beam/runners/core-construction-java/src/main/java/org/apache/beam/runners/core/construction/SplittableParDo.java

public class Nicad_t1_beam90
{
    public ProcessKeyedElements(
        DoFn<InputT, OutputT> fn,
        Coder<InputT> elementCoder,
        Coder<RestrictionT> restrictionCoder,
        WindowingStrategy<InputT, ?> windowingStrategy,
        List<PCollectionView<?>> sideInputs,
        TupleTag<OutputT> mainOutputTag,
        TupleTagList additionalOutputTags,
        Map<TupleTag<?>, Coder<?>> outputTagsToCoders) {
      this.fn = fn;
      this.elementCoder = elementCoder;
      this.restrictionCoder = restrictionCoder;
      this.windowingStrategy = windowingStrategy;
      this.sideInputs = sideInputs;
      this.mainOutputTag = mainOutputTag;
      this.additionalOutputTags = additionalOutputTags;
      this.outputTagsToCoders = outputTagsToCoders;
    }
}