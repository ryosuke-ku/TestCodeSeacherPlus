// clone pairs:10265:90%
// 11300:flink/flink-libraries/flink-python/src/main/java/org/apache/flink/python/api/PythonPlanBinder.java

public class Nicad_t2_flink496
{
	public static void main(String[] args) throws Exception {
		Configuration globalConfig = GlobalConfiguration.loadConfiguration();
		PythonPlanBinder binder = new PythonPlanBinder(globalConfig);
		try {
			binder.runPlan(args);
		} catch (Exception e) {
			System.out.println("Failed to run plan: " + e.getMessage());
			LOG.error("Failed to run plan.", e);
		}
	}
}