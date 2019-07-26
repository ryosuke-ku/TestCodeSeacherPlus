// clone pairs:6315:76%
// 6458:flink/flink-table/flink-sql-client/src/main/java/org/apache/flink/table/client/cli/CliClient.java

public class Nicad_t2_flink178
{
	private void callCreateView(SqlCommandCall cmdCall) {
		final String name = cmdCall.operands[0];
		final String query = cmdCall.operands[1];

		final ViewEntry previousView = context.getViews().get(name);
		if (previousView != null) {
			printExecutionError(CliStrings.MESSAGE_VIEW_ALREADY_EXISTS);
			return;
		}

		try {
			// perform and validate change
			context.addView(ViewEntry.create(name, query));
			executor.validateSession(context);
			printInfo(CliStrings.MESSAGE_VIEW_CREATED);
		} catch (SqlExecutionException e) {
			// rollback change
			context.removeView(name);
			printExecutionException(e);
		}
	}
}