// clone pairs:16138:90%
// 21345:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/messages/JobConfigInfo.java

public class Nicad_t2_flink971
{
		public boolean equals(Object o) {
			if (this == o) {
				return true;
			}
			if (o == null || getClass() != o.getClass()) {
				return false;
			}
			ExecutionConfigInfo that = (ExecutionConfigInfo) o;
			return parallelism == that.parallelism &&
				isObjectResuse == that.isObjectResuse &&
				Objects.equals(executionMode, that.executionMode) &&
				Objects.equals(restartStrategy, that.restartStrategy) &&
				Objects.equals(globalJobParameters, that.globalJobParameters);
		}
}