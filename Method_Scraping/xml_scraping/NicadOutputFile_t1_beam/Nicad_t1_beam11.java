// clone pairs:341:90%
// 180:beam/runners/google-cloud-dataflow-java/worker/src/main/java/org/apache/beam/runners/dataflow/worker/RunnerHarnessCoderCloudObjectTranslatorRegistrar.java

public class Nicad_t1_beam11
{
  private static <T extends Coder> CloudObjectTranslator<T> atomic(final Class<T> coderClass) {
    // Make sure that the instance will be instantiable from the class.
    InstanceBuilder.ofType(coderClass).fromFactoryMethod("of").build();
    return new CloudObjectTranslator<T>() {
      @Override
      public CloudObject toCloudObject(T target, SdkComponents sdkComponents) {
        throw new UnsupportedOperationException();
      }

      @Override
      public T fromCloudObject(CloudObject cloudObject) {
        return InstanceBuilder.ofType(coderClass).fromFactoryMethod("of").build();
      }

      @Override
      public Class<? extends T> getSupportedClass() {
        return coderClass;
      }

      @Override
      public String cloudObjectClassName() {
        return CloudObject.forClass(coderClass).getClassName();
      }
    };
  }
}