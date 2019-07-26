// clone pairs:1857:81%
// 1847:beam/runners/flink/src/main/java/org/apache/beam/runners/flink/FlinkStreamingPipelineTranslator.java

public class Nicad_t1_beam176
{
  public void visitPrimitiveTransform(TransformHierarchy.Node node) {
    LOG.info("{} visitPrimitiveTransform- {}", genSpaces(this.depth), node.getFullName());
    // get the transformation corresponding to hte node we are
    // currently visiting and translate it into its Flink alternative.

    PTransform<?, ?> transform = node.getTransform();
    StreamTransformTranslator<?> translator =
        FlinkStreamingTransformTranslators.getTranslator(transform);

    if (translator == null || !applyCanTranslate(transform, node, translator)) {
      String transformUrn = PTransformTranslation.urnForTransform(transform);
      LOG.info(transformUrn);
      throw new UnsupportedOperationException(
          "The transform " + transformUrn + " is currently not supported.");
    }
    applyStreamingTransform(transform, node, translator);
  }
}