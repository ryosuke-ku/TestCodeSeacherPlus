// clone pairs:9022:84%
// 10091:flink/flink-table/flink-table-api-java/src/main/java/org/apache/flink/table/catalog/GenericInMemoryCatalog.java

public class Nicad_t2_flink344
{
	public void alterDatabase(String databaseName, CatalogDatabase newDatabase, boolean ignoreIfNotExists)
			throws DatabaseNotExistException {
		checkArgument(!StringUtils.isNullOrWhitespaceOnly(databaseName));
		checkNotNull(newDatabase);

		CatalogDatabase existingDatabase = databases.get(databaseName);

		if (existingDatabase != null) {
			if (existingDatabase.getClass() != newDatabase.getClass()) {
				throw new CatalogException(
					String.format("Database types don't match. Existing database is '%s' and new database is '%s'.",
						existingDatabase.getClass().getName(), newDatabase.getClass().getName())
				);
			}

			databases.put(databaseName, newDatabase.copy());
		} else if (!ignoreIfNotExists) {
			throw new DatabaseNotExistException(getName(), databaseName);
		}
	}
}