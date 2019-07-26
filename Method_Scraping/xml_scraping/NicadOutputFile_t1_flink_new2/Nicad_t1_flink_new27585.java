// clone pairs:27913:70%
// 43621:flink/flink-runtime/src/main/java/org/apache/flink/runtime/executiongraph/ExecutionJobVertex.java

public class Nicad_t1_flink_new27585
{
	public StringifiedAccumulatorResult[] getAggregatedUserAccumulatorsStringified() {
		Map<String, OptionalFailure<Accumulator<?, ?>>> userAccumulators = new HashMap<>();

		for (ExecutionVertex vertex : taskVertices) {
			Map<String, Accumulator<?, ?>> next = vertex.getCurrentExecutionAttempt().getUserAccumulators();
			if (next != null) {
				AccumulatorHelper.mergeInto(userAccumulators, next);
			}
		}

		return StringifiedAccumulatorResult.stringifyAccumulatorResults(userAccumulators);
	}
}