// clone pairs:3306:72%
// 4888:flink/flink-runtime/src/main/java/org/apache/flink/runtime/query/KvStateLocation.java

public class Nicad_t1_flink_new233
{
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		KvStateLocation that = (KvStateLocation) o;

		if (numKeyGroups != that.numKeyGroups) {
			return false;
		}
		if (!jobId.equals(that.jobId)) {
			return false;
		}
		if (!jobVertexId.equals(that.jobVertexId)) {
			return false;
		}
		if (!registrationName.equals(that.registrationName)) {
			return false;
		}
		if (!Arrays.equals(kvStateIds, that.kvStateIds)) {
			return false;
		}

		return Arrays.equals(kvStateAddresses, that.kvStateAddresses);
	}
}