// clone pairs:8535:76%
// 9092:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/handler/legacy/messages/ClusterOverviewWithVersion.java

public class Nicad_t1_flink_new2278
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