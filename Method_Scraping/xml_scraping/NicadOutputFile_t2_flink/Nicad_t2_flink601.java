// clone pairs:10872:90%
// 11933:flink/flink-table/flink-sql-client/src/main/java/org/apache/flink/table/client/cli/CliClient.java

public class Nicad_t2_flink601
{
	private void callDescribe(SqlCommandCall cmdCall) {
		final TableSchema schema;
		try {
			schema = executor.getTableSchema(context, cmdCall.operands[0]);
		} catch (SqlExecutionException e) {
			printExecutionException(e);
			return;
		}
		terminal.writer().println(schema.toString());
		terminal.flush();
	}
}