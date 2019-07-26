// clone pairs:9656:80%
// 13173:beam/sdks/java/io/google-cloud-platform/src/main/java/org/apache/beam/sdk/io/gcp/bigtable/BigtableServiceImpl.java

public class Nicad_t1_beam_new22033
{
    public void flush() throws IOException {
      if (bulkMutation != null) {
        try {
          bulkMutation.flush();
        } catch (InterruptedException e) {
          Thread.currentThread().interrupt();
          // We fail since flush() operation was interrupted.
          throw new IOException(e);
        }
      }
    }
}