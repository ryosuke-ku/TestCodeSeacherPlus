// clone pairs:8174:76%
// 8382:flink/flink-streaming-java/src/main/java/org/apache/flink/streaming/api/functions/sink/TwoPhaseCommitSinkFunction.java

public class Nicad_t1_flink_new2230
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