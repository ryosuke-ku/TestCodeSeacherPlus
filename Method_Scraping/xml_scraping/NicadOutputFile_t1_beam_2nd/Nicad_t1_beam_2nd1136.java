// clone pairs:5634:70%
// 7375:beam/runners/flink/src/main/java/org/apache/beam/runners/flink/translation/wrappers/streaming/DoFnOperator.java

public class Nicad_t1_beam_2nd1136
{
    private void buffer(KV<Integer, WindowedValue<?>> taggedValue) {
      try {
        bufferLock.lock();
        pushedBackElementsHandler.pushBack(taggedValue);
      } catch (Exception e) {
        throw new RuntimeException("Couldn't pushback element.", e);
      } finally {
        bufferLock.unlock();
      }
    }
}