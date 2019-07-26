// clone pairs:8954:92%
// 9906:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/handler/legacy/messages/ClusterOverviewWithVersion.java

public class Nicad_t1_flink_new2373
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