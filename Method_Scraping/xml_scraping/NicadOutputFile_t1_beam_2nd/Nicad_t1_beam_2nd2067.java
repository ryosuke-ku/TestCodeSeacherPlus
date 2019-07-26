// clone pairs:9766:70%
// 13326:beam/sdks/java/io/google-cloud-platform/src/main/java/org/apache/beam/sdk/io/gcp/bigquery/BigQueryHelpers.java

public class Nicad_t1_beam_2nd2067
{
  static <T> T fromJsonString(String json, Class<T> clazz) {
    if (json == null) {
      return null;
    }
    try {
      return BigQueryIO.JSON_FACTORY.fromString(json, clazz);
    } catch (IOException e) {
      throw new RuntimeException(
          String.format("Cannot deserialize %s from a JSON string: %s.", clazz, json), e);
    }
  }
}