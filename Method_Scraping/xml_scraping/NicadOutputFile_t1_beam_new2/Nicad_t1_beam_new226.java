// clone pairs:851:73%
// 592:beam/sdks/java/fn-execution/src/main/java/org/apache/beam/sdk/fn/stream/BufferingStreamObserver.java

public class Nicad_t1_beam_new226
{
  public void onError(Throwable t) {
    synchronized (outboundObserver) {
      // If we are done, then a previous caller has already shutdown the queue processing thread
      // hence we don't need to do it again.
      if (!queueDrainer.isDone()) {
        // We check to see if we were able to successfully insert the poison pill at the front of
        // the queue to cancel the processing thread eagerly or if the processing thread is done.
        try {
          // We shouldn't attempt to insert into the queue if the queue drainer thread is done
          // since the queue may be full and nothing will be emptying it.
          while (!queueDrainer.isDone()
              && !queue.offerFirst((T) POISON_PILL, 60, TimeUnit.SECONDS)) {}
        } catch (InterruptedException e) {
          Thread.currentThread().interrupt();
          throw new RuntimeException(e);
        }
        waitTillFinish();
      }
      outboundObserver.onError(t);
    }
  }
}