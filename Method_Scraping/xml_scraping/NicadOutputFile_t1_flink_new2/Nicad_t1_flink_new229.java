// clone pairs:3130:70%
// 4724:flink/flink-java/src/main/java/org/apache/flink/api/java/operators/AggregateOperator.java

public class Nicad_t1_flink_new229
{
		public void reduce(Iterable<T> records, Collector<T> out) {
			final AggregationFunction<Object>[] aggFunctions = this.aggFunctions;
			final int[] fieldPositions = this.fieldPositions;

			// aggregators are initialized from before

			T outT = null;
			for (T record : records) {
				outT = record;

				for (int i = 0; i < fieldPositions.length; i++) {
					Object val = record.getFieldNotNull(fieldPositions[i]);
					aggFunctions[i].aggregate(val);
				}
			}

			for (int i = 0; i < fieldPositions.length; i++) {
				Object aggVal = aggFunctions[i].getAggregate();
				outT.setField(aggVal, fieldPositions[i]);
				aggFunctions[i].initializeAggregate();
			}

			out.collect(outT);
		}
}