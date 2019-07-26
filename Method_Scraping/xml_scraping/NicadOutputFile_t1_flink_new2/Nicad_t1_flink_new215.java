// clone pairs:483:72%
// 826:flink/flink-table/flink-sql-client/src/main/java/org/apache/flink/table/client/cli/CliClient.java

public class Nicad_t1_flink_new215
{
	private void callCommand(SqlCommandCall cmdCall) {
		switch (cmdCall.command) {
			case QUIT:
				callQuit();
				break;
			case CLEAR:
				callClear();
				break;
			case RESET:
				callReset();
				break;
			case SET:
				callSet(cmdCall);
				break;
			case HELP:
				callHelp();
				break;
			case SHOW_TABLES:
				callShowTables();
				break;
			case SHOW_FUNCTIONS:
				callShowFunctions();
				break;
			case DESCRIBE:
				callDescribe(cmdCall);
				break;
			case EXPLAIN:
				callExplain(cmdCall);
				break;
			case SELECT:
				callSelect(cmdCall);
				break;
			case INSERT_INTO:
				callInsertInto(cmdCall);
				break;
			case CREATE_VIEW:
				callCreateView(cmdCall);
				break;
			case DROP_VIEW:
				callDropView(cmdCall);
				break;
			case SOURCE:
				callSource(cmdCall);
				break;
			default:
				throw new SqlClientException("Unsupported command: " + cmdCall.command);
		}
	}
}