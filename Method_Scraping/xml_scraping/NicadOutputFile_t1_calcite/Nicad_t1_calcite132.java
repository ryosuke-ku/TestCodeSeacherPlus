// clone pairs:1309:70%
// 2277:calcite/elasticsearch/src/main/java/org/apache/calcite/adapter/elasticsearch/ElasticsearchJson.java

public class Nicad_t1_calcite132
{
    @Override public boolean equals(final Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      final RowKey rowKey = (RowKey) o;
      return hashCode == rowKey.hashCode
          && Objects.equals(keys, rowKey.keys);
    }
}