// clone pairs:1094:71%
// 783:beam/sdks/java/io/google-cloud-platform/src/main/java/org/apache/beam/sdk/io/gcp/bigtable/BigtableServiceImpl.java

public class Nicad_t1_beam_2nd46
{
    public void close() throws IOException {
      // Goal: by the end of this function, both results and session are null and closed,
      // independent of what errors they throw or prior state.

      if (session == null) {
        // Only possible when previously closed, so we know that results is also null.
        return;
      }

      // Session does not implement Closeable -- it's AutoCloseable. So we can't register it with
      // the Closer, but we can use the Closer to simplify the error handling.
      try (Closer closer = Closer.create()) {
        if (results != null) {
          closer.register(results);
          results = null;
        }

        session.close();
      } finally {
        session = null;
      }
    }
}