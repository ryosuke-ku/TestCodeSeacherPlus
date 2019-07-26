// clone pairs:9665:100%
// 10468:flink/flink-java/src/main/java/org/apache/flink/api/java/operators/AggregateOperator.java

public class Nicad_t1_flink_new2421
{
	public AggregateOperator<IN> and(Aggregations function, int field) {
		Preconditions.checkNotNull(function);

		TupleTypeInfoBase<?> inType = (TupleTypeInfoBase<?>) getType();

		if (field < 0 || field >= inType.getArity()) {
			throw new IllegalArgumentException("Aggregation field position is out of range.");
		}

		AggregationFunctionFactory factory = function.getFactory();
		AggregationFunction<?> aggFunct = factory.createAggregationFunction(inType.getTypeAt(field).getTypeClass());

		this.aggregationFunctions.add(aggFunct);
		this.fields.add(field);

		return this;
	}
}