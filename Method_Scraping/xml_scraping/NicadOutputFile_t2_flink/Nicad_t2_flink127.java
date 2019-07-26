// clone pairs:5488:73%
// 5890:flink/flink-table/flink-table-api-java/src/main/java/org/apache/flink/table/catalog/GenericInMemoryCatalog.java

public class Nicad_t2_flink127
{
	public void createTable(ObjectPath tablePath, CatalogBaseTable table, boolean ignoreIfExists)
			throws TableAlreadyExistException, DatabaseNotExistException {
		checkNotNull(tablePath);
		checkNotNull(table);

		if (!databaseExists(tablePath.getDatabaseName())) {
			throw new DatabaseNotExistException(getName(), tablePath.getDatabaseName());
		}

		if (tableExists(tablePath)) {
			if (!ignoreIfExists) {
				throw new TableAlreadyExistException(getName(), tablePath);
			}
		} else {
			tables.put(tablePath, table.copy());

			if (isPartitionedTable(tablePath)) {
				partitions.put(tablePath, new LinkedHashMap<>());
				partitionStats.put(tablePath, new LinkedHashMap<>());
				partitionColumnStats.put(tablePath, new LinkedHashMap<>());
			}
		}
	}
}