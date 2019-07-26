// clone pairs:902:71%
// 615:beam/sdks/java/core/src/main/java/org/apache/beam/sdk/transforms/reflect/DoFnInvokers.java

public class Nicad_t1_beam_2nd38
{
  public static <InputT, OutputT> DoFnInvoker<InputT, OutputT> tryInvokeSetupFor(
      DoFn<InputT, OutputT> fn) {
    DoFnInvoker<InputT, OutputT> doFnInvoker = invokerFor(fn);
    try {
      doFnInvoker.invokeSetup();
    } catch (Exception e) {
      try {
        doFnInvoker.invokeTeardown();
      } catch (Exception suppressed) {
        e.addSuppressed(suppressed);
      }
      throw e;
    }
    return doFnInvoker;
  }
}