// clone pairs:8158:76%
// 8349:flink/flink-streaming-java/src/main/java/org/apache/flink/streaming/api/functions/sink/TwoPhaseCommitSinkFunction.java

public class Nicad_t1_flink_new2214
{
		public boolean equals(Object o) {
			if (this == o) {
				return true;
			}
			if (o == null || getClass() != o.getClass()) {
				return false;
			}

			StateSerializer<?, ?> that = (StateSerializer<?, ?>) o;

			if (!transactionSerializer.equals(that.transactionSerializer)) {
				return false;
			}
			return contextSerializer.equals(that.contextSerializer);
		}
}