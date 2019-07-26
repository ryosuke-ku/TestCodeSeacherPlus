// clone pairs:1941:72%
// 1736:beam/runners/core-construction-java/src/main/java/org/apache/beam/runners/core/construction/SplittableParDo.java

public class Nicad_t1_beam_2nd152
{
    public void ProcessKeyedElements(
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