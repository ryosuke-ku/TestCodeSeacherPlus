// clone pairs:5778:90%
// 7595:beam/sdks/java/testing/nexmark/src/main/java/org/apache/beam/sdk/nexmark/sources/generator/Generator.java

public class Nicad_t1_beam_new21161
{
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }

      NextEvent nextEvent = (NextEvent) o;

      return (wallclockTimestamp == nextEvent.wallclockTimestamp
          && eventTimestamp == nextEvent.eventTimestamp
          && watermark == nextEvent.watermark
          && event.equals(nextEvent.event));
    }
}