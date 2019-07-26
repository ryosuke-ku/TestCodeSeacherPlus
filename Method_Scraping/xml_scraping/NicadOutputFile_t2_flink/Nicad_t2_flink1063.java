// clone pairs:19998:100%
// 28774:flink/flink-table/flink-table-api-java/src/main/java/org/apache/flink/table/catalog/GenericInMemoryCatalog.java

public class Nicad_t2_flink1063
{
	public void alterPartitionStatistics(ObjectPath tablePath, CatalogPartitionSpec partitionSpec, CatalogTableStatistics partitionStatistics,
			boolean ignoreIfNotExists) throws PartitionNotExistException {
		checkNotNull(tablePath);
		checkNotNull(partitionSpec);
		checkNotNull(partitionStatistics);

		if (partitionExists(tablePath, partitionSpec)) {
			partitionStats.get(tablePath).put(partitionSpec, partitionStatistics.copy());
		} else if (!ignoreIfNotExists) {
			throw new PartitionNotExistException(getName(), tablePath, partitionSpec);
		}
	}
}