// clone pairs:1453:75%
// 1355:beam/sdks/java/fn-execution/src/main/java/org/apache/beam/sdk/fn/stream/BufferingStreamObserver.java

public class Nicad_t1_beam81
{
  private void waitTillFinish() {
    try {
      queueDrainer.get();
    } catch (CancellationException e) {
      // Cancellation is expected
      return;
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new RuntimeException(e);
    } catch (ExecutionException e) {
      throw new RuntimeException(e);
    }
  }
}