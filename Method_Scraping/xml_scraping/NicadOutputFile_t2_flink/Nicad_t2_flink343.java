// clone pairs:9021:92%
// 10089:flink/flink-table/flink-table-api-java/src/main/java/org/apache/flink/table/catalog/GenericInMemoryCatalog.java

public class Nicad_t2_flink343
{
	public void alterTable(ObjectPath tablePath, CatalogBaseTable newTable, boolean ignoreIfNotExists)
			throws TableNotExistException {
		checkNotNull(tablePath);
		checkNotNull(newTable);

		CatalogBaseTable existingTable = tables.get(tablePath);

		if (existingTable != null) {
			if (existingTable.getClass() != newTable.getClass()) {
				throw new CatalogException(
					String.format("Table types don't match. Existing table is '%s' and new table is '%s'.",
						existingTable.getClass().getName(), newTable.getClass().getName()));
			}

			tables.put(tablePath, newTable.copy());
		} else if (!ignoreIfNotExists) {
			throw new TableNotExistException(getName(), tablePath);
		}
	}
}