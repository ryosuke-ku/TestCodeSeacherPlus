// clone pairs:8059:76%
// 8161:flink/flink-streaming-java/src/main/java/org/apache/flink/streaming/api/functions/sink/TwoPhaseCommitSinkFunction.java

public class Nicad_t1_flink_new2174
{
		public boolean equals(Object o) {
			if (this == o) {
				return true;
			}
			if (o == null || getClass() != o.getClass()) {
				return false;
			}

			TransactionHolder<?> that = (TransactionHolder<?>) o;

			if (transactionStartTime != that.transactionStartTime) {
				return false;
			}
			return handle != null ? handle.equals(that.handle) : that.handle == null;
		}
}