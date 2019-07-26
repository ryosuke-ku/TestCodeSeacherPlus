// clone pairs:15500:100%
// 17351:beam/runners/google-cloud-dataflow-java/worker/src/main/java/org/apache/beam/runners/dataflow/worker/util/common/worker/GroupingShuffleRangeTracker.java

public class Nicad_t1_beam_new22407
{
  public synchronized long getSplitPointsProcessed() {
    if (!isStarted()) {
      return 0;
    } else if (isDone()) {
      return splitPointsSeen;
    } else {
      // There is a current split point, and it has not finished processing.
      checkState(
          splitPointsSeen > 0,
          "A started rangeTracker should have seen > 0 split points (is %s)",
          splitPointsSeen);
      return splitPointsSeen - 1;
    }
  }
}