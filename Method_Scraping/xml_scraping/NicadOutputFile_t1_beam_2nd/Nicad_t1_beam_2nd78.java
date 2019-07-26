// clone pairs:1453:75%
// 1224:beam/sdks/java/fn-execution/src/main/java/org/apache/beam/sdk/fn/stream/BufferingStreamObserver.java

public class Nicad_t1_beam_2nd78
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