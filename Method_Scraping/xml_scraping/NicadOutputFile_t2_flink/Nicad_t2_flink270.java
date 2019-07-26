// clone pairs:7054:71%
// 7212:flink/flink-streaming-java/src/main/java/org/apache/flink/streaming/util/typeutils/FieldAccessor.java

public class Nicad_t2_flink270
{
		SimpleProductFieldAccessor(int pos, TypeInformation<T> typeInfo, ExecutionConfig config) {
			checkNotNull(typeInfo, "typeInfo must not be null.");
			int arity = ((TupleTypeInfoBase) typeInfo).getArity();
			if (pos < 0 || pos >= arity) {
				throw new CompositeType.InvalidFieldReferenceException(
					"Tried to select " + ((Integer) pos).toString() + ". field on \"" +
						typeInfo.toString() + "\", which is an invalid index.");
			}

			this.pos = pos;
			this.fieldType = ((TupleTypeInfoBase<T>) typeInfo).getTypeAt(pos);
			this.serializer = (TupleSerializerBase<T>) typeInfo.createSerializer(config);
			this.length = this.serializer.getArity();
			this.fields = new Object[this.length];
		}
}