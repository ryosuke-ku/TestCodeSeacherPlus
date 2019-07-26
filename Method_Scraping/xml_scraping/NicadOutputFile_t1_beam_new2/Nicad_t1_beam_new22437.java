// clone pairs:15594:70%
// 17510:beam/runners/google-cloud-dataflow-java/worker/src/main/java/org/apache/beam/runners/dataflow/worker/util/common/worker/ParDoOperation.java

public class Nicad_t1_beam_new22437
{
  public void finish() throws Exception {
    try (Closeable scope = context.enterProcessTimers()) {
      checkStarted();
      fn.processTimers();
    }

    try (Closeable scope = context.enterFinish()) {
      fn.finishBundle();
      super.finish();
    }
  }
}