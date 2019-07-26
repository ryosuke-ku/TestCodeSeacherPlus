// clone pairs:1702:100%
// 1441:beam/sdks/java/io/hbase/src/main/java/org/apache/beam/sdk/io/hbase/HBaseIO.java

public class Nicad_t1_beam_new296
{
    public void close() throws IOException {
      LOG.debug("Closing reader after reading {} records.", recordsReturned);
      if (scanner != null) {
        scanner.close();
        scanner = null;
      }
      if (connection != null) {
        connection.close();
        connection = null;
      }
    }
}