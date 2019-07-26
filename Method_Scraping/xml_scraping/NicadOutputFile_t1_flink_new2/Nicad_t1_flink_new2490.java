// clone pairs:10643:72%
// 11538:flink/flink-runtime/src/main/java/org/apache/flink/runtime/jobmaster/JobMaster.java

public class Nicad_t1_flink_new2490
{
	private void closeResourceManagerConnection(Exception cause) {
		if (establishedResourceManagerConnection != null) {
			dissolveResourceManagerConnection(establishedResourceManagerConnection, cause);
			establishedResourceManagerConnection = null;
		}

		if (resourceManagerConnection != null) {
			// stop a potentially ongoing registration process
			resourceManagerConnection.close();
			resourceManagerConnection = null;
		}
	}
}