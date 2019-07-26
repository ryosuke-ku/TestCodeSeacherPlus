// clone pairs:7051:85%
// 7156:flink/flink-java/src/main/java/org/apache/flink/api/java/operators/JoinOperator.java

public class Nicad_t1_flink_new2111
{
		public <OUT extends Tuple> JoinOperator<I1, I2, OUT> types(Class<?>... types) {
			TupleTypeInfo<OUT> typeInfo = (TupleTypeInfo<OUT>) this.getResultType();

			if (types.length != typeInfo.getArity()) {
				throw new InvalidProgramException("Provided types do not match projection.");
			}
			for (int i = 0; i < types.length; i++) {
				Class<?> typeClass = types[i];
				if (!typeClass.equals(typeInfo.getTypeAt(i).getTypeClass())) {
					throw new InvalidProgramException("Provided type " + typeClass.getSimpleName() + " at position " + i + " does not match projection");
				}
			}
			return (JoinOperator<I1, I2, OUT>) this;
		}
}