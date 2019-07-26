// clone pairs:15594:70%
// 22235:beam/runners/google-cloud-dataflow-java/worker/src/main/java/org/apache/beam/runners/dataflow/worker/util/common/worker/ParDoOperation.java

public class Nicad_t1_beam3961
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