// clone pairs:6300:88%
// 6419:flink/flink-java/src/main/java/org/apache/flink/api/java/operators/AggregateOperator.java

public class Nicad_t1_flink_new281
{
	public AggregateOperator(DataSet<IN> input, Aggregations function, int field, String aggregateLocationName) {
		super(Preconditions.checkNotNull(input), input.getType());
		Preconditions.checkNotNull(function);

		this.aggregateLocationName = aggregateLocationName;

		if (!input.getType().isTupleType()) {
			throw new InvalidProgramException("Aggregating on field positions is only possible on tuple data types.");
		}

		TupleTypeInfoBase<?> inType = (TupleTypeInfoBase<?>) input.getType();

		if (field < 0 || field >= inType.getArity()) {
			throw new IllegalArgumentException("Aggregation field position is out of range.");
		}

		AggregationFunctionFactory factory = function.getFactory();
		AggregationFunction<?> aggFunct = factory.createAggregationFunction(inType.getTypeAt(field).getTypeClass());

		// this is the first aggregation operator after a regular data set (non grouped aggregation)
		this.aggregationFunctions.add(aggFunct);
		this.fields.add(field);
		this.grouping = null;
	}
}