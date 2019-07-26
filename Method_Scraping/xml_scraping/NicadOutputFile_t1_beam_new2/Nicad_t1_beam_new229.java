// clone pairs:1000:71%
// 702:beam/sdks/java/io/mongodb/src/main/java/org/apache/beam/sdk/io/mongodb/MongoDbIO.java

public class Nicad_t1_beam_new229
{
    public void close() {
      try {
        if (cursor != null) {
          cursor.close();
        }
      } catch (Exception e) {
        LOG.warn("Error closing MongoDB cursor", e);
      }
      try {
        client.close();
      } catch (Exception e) {
        LOG.warn("Error closing MongoDB client", e);
      }
    }
}