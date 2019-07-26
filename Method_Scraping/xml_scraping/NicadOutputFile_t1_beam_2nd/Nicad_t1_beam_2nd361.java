// clone pairs:2737:70%
// 2940:beam/runners/core-construction-java/src/main/java/org/apache/beam/runners/core/construction/expansion/ExpansionServer.java

public class Nicad_t1_beam_2nd361
{
  public void close() throws Exception {
    try {
      // The server has been closed, and should not respond to any new incoming calls.
      server.shutdown();
      service.close();
      server.awaitTermination(60, TimeUnit.SECONDS);
    } finally {
      server.shutdownNow();
      server.awaitTermination();
    }
  }
}