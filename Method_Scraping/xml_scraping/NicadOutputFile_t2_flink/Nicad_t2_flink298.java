// clone pairs:8014:92%
// 8160:flink/flink-java/src/main/java/org/apache/flink/api/java/operators/CoGroupOperator.java

public class Nicad_t2_flink298
{
	private static <I1, I2, K, OUT> PlanRightUnwrappingCoGroupOperator<I1, I2, OUT, K> translateSelectorFunctionCoGroupRight(
			int[] logicalKeyPositions1, SelectorFunctionKeys<I2, ?> rawKeys2,
			CoGroupFunction<I1, I2, OUT> function,
			TypeInformation<I1> inputType1, TypeInformation<OUT> outputType, String name,
			Operator<I1> input1, Operator<I2> input2) {
		if (!inputType1.isTupleType()) {
			throw new InvalidParameterException("Should not happen.");
		}

		@SuppressWarnings("unchecked")
		final SelectorFunctionKeys<I2, K> keys2 = (SelectorFunctionKeys<I2, K>) rawKeys2;
		final TypeInformation<Tuple2<K, I2>> typeInfoWithKey2 = KeyFunctions.createTypeWithKey(keys2);
		final Operator<Tuple2<K, I2>> keyedInput2 = KeyFunctions.appendKeyExtractor(input2, keys2);

		final PlanRightUnwrappingCoGroupOperator<I1, I2, OUT, K> cogroup =
				new PlanRightUnwrappingCoGroupOperator<>(
						function,
						logicalKeyPositions1,
						keys2,
						name,
						outputType,
						inputType1,
						typeInfoWithKey2);

		cogroup.setFirstInput(input1);
		cogroup.setSecondInput(keyedInput2);

		return cogroup;
	}
}