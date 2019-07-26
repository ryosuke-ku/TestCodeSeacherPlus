// clone pairs:1442:75%
// 1219:beam/runners/direct-java/src/main/java/org/apache/beam/runners/direct/CopyOnAccessInMemoryStateInternals.java

public class Nicad_t1_beam_new267
{
    private Instant getEarliestWatermarkHold() {
      Instant earliest = BoundedWindow.TIMESTAMP_MAX_VALUE;
      for (State existingState : this.values()) {
        if (existingState instanceof WatermarkHoldState) {
          Instant hold = ((WatermarkHoldState) existingState).read();
          if (hold != null && hold.isBefore(earliest)) {
            earliest = hold;
          }
        }
      }
      return earliest;
    }
}