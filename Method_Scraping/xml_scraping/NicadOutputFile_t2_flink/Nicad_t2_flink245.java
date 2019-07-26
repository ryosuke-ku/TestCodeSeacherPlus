// clone pairs:6820:100%
// 6948:flink/flink-table/flink-sql-client/src/main/java/org/apache/flink/table/client/cli/CliClient.java

public class Nicad_t2_flink245
{
	private void callShowTables() {
		final List<String> tables;
		try {
			tables = executor.listTables(context);
		} catch (SqlExecutionException e) {
			printExecutionException(e);
			return;
		}
		if (tables.isEmpty()) {
			terminal.writer().println(CliStrings.messageInfo(CliStrings.MESSAGE_EMPTY).toAnsi());
		} else {
			tables.forEach((v) -> terminal.writer().println(v));
		}
		terminal.flush();
	}
}