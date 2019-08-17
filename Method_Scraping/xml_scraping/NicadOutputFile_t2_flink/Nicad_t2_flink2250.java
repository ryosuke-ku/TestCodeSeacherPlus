// clone pairs:25746:90%
// 39675:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/JobExceptionsInfo.java

public class Nicad_t2_flink2250
{
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		JobExceptionsInfo that = (JobExceptionsInfo) o;
		return truncated == that.truncated &&
			Objects.equals(rootException, that.rootException) &&
			Objects.equals(rootTimestamp, that.rootTimestamp) &&
			Objects.equals(allExceptions, that.allExceptions);
	}
}