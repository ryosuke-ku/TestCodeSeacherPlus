// clone pairs:7754:76%
// 7651:flink/flink-connectors/flink-connector-hive/src/main/java/org/apache/flink/batch/connectors/hive/HiveTableOutputFormat.java

public class Nicad_t1_flink_new2143
{
	private void writeObject(ObjectOutputStream out) throws IOException {
		super.write(out);
		jobConf.write(out);
		out.writeObject(isPartitioned);
		out.writeObject(isDynamicPartition);
		out.writeObject(overwrite);
		out.writeObject(rowTypeInfo);
		out.writeObject(hiveTablePartition);
		out.writeObject(partitionCols);
		out.writeObject(dbName);
		out.writeObject(tableName);
		out.writeObject(tblProperties);
	}
}