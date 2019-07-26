// clone pairs:8364:92%
// 8754:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/handler/legacy/messages/ClusterOverviewWithVersion.java

public class Nicad_t1_flink_new2258
{
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		if (!super.equals(o)) {
			return false;
		}

		ClusterOverviewWithVersion that = (ClusterOverviewWithVersion) o;

		return Objects.equals(version, that.getVersion()) && Objects.equals(commitId, that.getCommitId());
	}
}