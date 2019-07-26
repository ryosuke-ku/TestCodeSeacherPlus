// clone pairs:10883:72%
// 11876:flink/flink-table/flink-table-runtime-blink/src/main/java/org/apache/flink/table/typeutils/DecimalSerializer.java

public class Nicad_t1_flink_new2524
{
		public TypeSerializerSchemaCompatibility<Decimal> resolveSchemaCompatibility(TypeSerializer<Decimal> newSerializer) {
			if (!(newSerializer instanceof DecimalSerializer)) {
				return TypeSerializerSchemaCompatibility.incompatible();
			}

			DecimalSerializer newDecimalSerializer = (DecimalSerializer) newSerializer;
			if (previousPrecision != newDecimalSerializer.precision ||
					previousScale != newDecimalSerializer.scale) {
				return TypeSerializerSchemaCompatibility.incompatible();
			} else {
				return TypeSerializerSchemaCompatibility.compatibleAsIs();
			}
		}
}