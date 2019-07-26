// clone pairs:296:94%
// 526:flink/flink-java/src/main/java/org/apache/flink/api/java/operators/AggregateOperator.java

public class Nicad_t1_flink_new28
{
	protected org.apache.flink.api.common.operators.base.GroupReduceOperatorBase<IN, IN, GroupReduceFunction<IN, IN>> translateToDataFlow(Operator<IN> input) {

		// sanity check
		if (this.aggregationFunctions.isEmpty() || this.aggregationFunctions.size() != this.fields.size()) {
			throw new IllegalStateException();
		}

		// construct the aggregation function
		AggregationFunction<Object>[] aggFunctions = new AggregationFunction[this.aggregationFunctions.size()];
		int[] fields = new int[this.fields.size()];
		StringBuilder genName = new StringBuilder();

		for (int i = 0; i < fields.length; i++) {
			aggFunctions[i] = (AggregationFunction<Object>) this.aggregationFunctions.get(i);
			fields[i] = this.fields.get(i);

			genName.append(aggFunctions[i].toString()).append('(').append(fields[i]).append(')').append(',');
		}
		genName.append(" at ").append(aggregateLocationName);
		genName.setLength(genName.length() - 1);

		@SuppressWarnings("rawtypes")
		RichGroupReduceFunction<IN, IN> function = new AggregatingUdf(aggFunctions, fields);

		String name = getName() != null ? getName() : genName.toString();

		// distinguish between grouped reduce and non-grouped reduce
		if (this.grouping == null) {
			// non grouped aggregation
			UnaryOperatorInformation<IN, IN> operatorInfo = new UnaryOperatorInformation<>(getInputType(), getResultType());
			GroupReduceOperatorBase<IN, IN, GroupReduceFunction<IN, IN>> po =
					new GroupReduceOperatorBase<IN, IN, GroupReduceFunction<IN, IN>>(function, operatorInfo, new int[0], name);

			po.setCombinable(true);

			// set input
			po.setInput(input);
			// set parallelism
			po.setParallelism(this.getParallelism());

			return po;
		}

		if (this.grouping.getKeys() instanceof Keys.ExpressionKeys) {
			// grouped aggregation
			int[] logicalKeyPositions = this.grouping.getKeys().computeLogicalKeyPositions();
			UnaryOperatorInformation<IN, IN> operatorInfo = new UnaryOperatorInformation<>(getInputType(), getResultType());
			GroupReduceOperatorBase<IN, IN, GroupReduceFunction<IN, IN>> po =
					new GroupReduceOperatorBase<IN, IN, GroupReduceFunction<IN, IN>>(function, operatorInfo, logicalKeyPositions, name);

			po.setCombinable(true);

			po.setInput(input);
			po.setParallelism(this.getParallelism());
			po.setCustomPartitioner(grouping.getCustomPartitioner());

			SingleInputSemanticProperties props = new SingleInputSemanticProperties();

			for (int keyField : logicalKeyPositions) {
				boolean keyFieldUsedInAgg = false;

				for (int aggField : fields) {
					if (keyField == aggField) {
						keyFieldUsedInAgg = true;
						break;
					}
				}

				if (!keyFieldUsedInAgg) {
					props.addForwardedField(keyField, keyField);
				}
			}

			po.setSemanticProperties(props);

			return po;
		}
		else if (this.grouping.getKeys() instanceof Keys.SelectorFunctionKeys) {
			throw new UnsupportedOperationException("Aggregate does not support grouping with KeySelector functions, yet.");
		}
		else {
			throw new UnsupportedOperationException("Unrecognized key type.");
		}

	}
}