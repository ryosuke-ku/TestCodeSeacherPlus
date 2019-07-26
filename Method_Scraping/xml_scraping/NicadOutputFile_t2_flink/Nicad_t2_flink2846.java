// clone pairs:28691:80%
// 44665:flink/flink-java/src/main/java/org/apache/flink/api/java/operators/GroupReduceOperator.java

public class Nicad_t2_flink2846
{
	private static <IN, OUT, K1, K2> PlanUnwrappingSortedReduceGroupOperator<IN, OUT, K1, K2> translateSelectorFunctionSortedReducer(
		SelectorFunctionKeys<IN, ?> rawGroupingKey,
		SelectorFunctionKeys<IN, ?> rawSortingKey,
		Ordering groupOrdering,
		GroupReduceFunction<IN, OUT> function,
		TypeInformation<OUT> outputType,
		String name,
		Operator<IN> input,
		boolean combinable) {
		final SelectorFunctionKeys<IN, K1> groupingKey = (SelectorFunctionKeys<IN, K1>) rawGroupingKey;
		final SelectorFunctionKeys<IN, K2> sortingKey = (SelectorFunctionKeys<IN, K2>) rawSortingKey;
		TypeInformation<Tuple3<K1, K2, IN>> typeInfoWithKey = KeyFunctions.createTypeWithKey(groupingKey, sortingKey);

		Operator<Tuple3<K1, K2, IN>> inputWithKey = KeyFunctions.appendKeyExtractor(input, groupingKey, sortingKey);

		PlanUnwrappingSortedReduceGroupOperator<IN, OUT, K1, K2> reducer =
			new PlanUnwrappingSortedReduceGroupOperator<>(
				function, groupingKey, sortingKey, name, outputType, typeInfoWithKey, combinable);
		reducer.setInput(inputWithKey);
		reducer.setGroupOrder(groupOrdering);

		return reducer;
	}
}