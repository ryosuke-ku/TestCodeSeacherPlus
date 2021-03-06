// clone pairs:8729:70%
// 13423:beam/sdks/java/io/elasticsearch/src/main/java/org/apache/beam/sdk/io/elasticsearch/ElasticsearchIO.java

public class Nicad_t1_beam2627
{
    private BoundedElasticsearchSource(
        Read spec,
        @Nullable String shardPreference,
        @Nullable Integer numSlices,
        @Nullable Integer sliceId,
        int backendVersion) {
      this.backendVersion = backendVersion;
      this.spec = spec;
      this.shardPreference = shardPreference;
      this.numSlices = numSlices;
      this.sliceId = sliceId;
    }
}