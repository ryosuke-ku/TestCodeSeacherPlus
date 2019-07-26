// clone pairs:7324:92%
// 7470:flink/flink-table/flink-table-planner-blink/src/main/java/org/apache/flink/table/functions/aggfunctions/MaxWithRetractAggFunction.java

public class Nicad_t2_flink274
{
	public TypeInformation<MaxWithRetractAccumulator<T>> getAccumulatorType() {
		PojoTypeInfo pojoType = (PojoTypeInfo) TypeExtractor.createTypeInfo(MaxWithRetractAccumulator.class);
		List<PojoField> pojoFields = new ArrayList<>();
		for (int i = 0; i < pojoType.getTotalFields(); i++) {
			PojoField field = pojoType.getPojoFieldAt(i);
			if (field.getField().getName().equals("max")) {
				pojoFields.add(new PojoField(field.getField(), getValueTypeInfo()));
			} else {
				pojoFields.add(field);
			}
		}
		//noinspection unchecked
		return new PojoTypeInfo(pojoType.getTypeClass(), pojoFields);
	}
}