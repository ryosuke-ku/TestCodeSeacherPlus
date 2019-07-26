// clone pairs:7593:85%
// 7492:flink/flink-java/src/main/java/org/apache/flink/api/java/operators/CrossOperator.java

public class Nicad_t1_flink_new2126
{
		public <OUT extends Tuple> CrossOperator<I1, I2, OUT> types(Class<?>... types) {
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
			return (CrossOperator<I1, I2, OUT>) this;
		}
}