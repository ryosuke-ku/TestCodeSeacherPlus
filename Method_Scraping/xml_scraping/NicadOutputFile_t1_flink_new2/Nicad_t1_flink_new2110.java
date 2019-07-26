// clone pairs:7043:80%
// 7142:flink/flink-connectors/flink-connector-hive/src/main/java/org/apache/flink/batch/connectors/hive/HiveTableOutputFormat.java

public class Nicad_t1_flink_new2110
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