// clone pairs:6306:88%
// 6425:flink/flink-java/src/main/java/org/apache/flink/api/java/operators/AggregateOperator.java

public class Nicad_t1_flink_new282
{
	public AggregateOperator(Grouping<IN> input, Aggregations function, int field, String aggregateLocationName) {
		super(Preconditions.checkNotNull(input).getInputDataSet(), input.getInputDataSet().getType());
		Preconditions.checkNotNull(function);

		this.aggregateLocationName = aggregateLocationName;

		if (!input.getInputDataSet().getType().isTupleType()) {
			throw new InvalidProgramException("Aggregating on field positions is only possible on tuple data types.");
		}

		TupleTypeInfoBase<?> inType = (TupleTypeInfoBase<?>) input.getInputDataSet().getType();

		if (field < 0 || field >= inType.getArity()) {
			throw new IllegalArgumentException("Aggregation field position is out of range.");
		}

		AggregationFunctionFactory factory = function.getFactory();
		AggregationFunction<?> aggFunct = factory.createAggregationFunction(inType.getTypeAt(field).getTypeClass());

		// set the aggregation fields
		this.aggregationFunctions.add(aggFunct);
		this.fields.add(field);
		this.grouping = input;
	}
}