// clone pairs:1682:81%
// 1559:beam/sdks/java/core/src/main/java/org/apache/beam/sdk/transforms/FlatMapElements.java

public class Nicad_t1_beam106
{
    FlatMapWithFailures(
        @Nullable Contextful<Fn<InputT, Iterable<OutputT>>> fn,
        Object originalFnForDisplayData,
        TypeDescriptor<InputT> inputType,
        TypeDescriptor<OutputT> outputType,
        @Nullable ProcessFunction<ExceptionElement<InputT>, FailureT> exceptionHandler,
        @Nullable TypeDescriptor<FailureT> failureType) {
      this.fn = fn;
      this.originalFnForDisplayData = originalFnForDisplayData;
      this.inputType = inputType;
      this.outputType = outputType;
      this.exceptionHandler = exceptionHandler;
      this.failureType = failureType;
    }
}