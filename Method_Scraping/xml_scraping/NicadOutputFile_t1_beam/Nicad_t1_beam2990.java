// clone pairs:9767:70%
// 15079:beam/sdks/java/io/google-cloud-platform/src/main/java/org/apache/beam/sdk/io/gcp/bigquery/BigQueryHelpers.java

public class Nicad_t1_beam2990
{
  static String toJsonString(Object item) {
    if (item == null) {
      return null;
    }
    try {
      return BigQueryIO.JSON_FACTORY.toString(item);
    } catch (IOException e) {
      throw new RuntimeException(
          String.format("Cannot serialize %s to a JSON string.", item.getClass().getSimpleName()),
          e);
    }
  }
}