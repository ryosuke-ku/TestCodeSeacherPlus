// clone pairs:28158:70%
// 44387:flink/flink-libraries/flink-gelly/src/main/java/org/apache/flink/graph/asm/translate/Translate.java

public class Nicad_t2_flink2837
{
	public static <K, OLD, NEW> DataSet<Vertex<K, NEW>> translateVertexValues(DataSet<Vertex<K, OLD>> vertices, TranslateFunction<OLD, NEW> translator, int parallelism) {
		Preconditions.checkNotNull(vertices);
		Preconditions.checkNotNull(translator);

		Class<Vertex<K, NEW>> vertexClass = (Class<Vertex<K, NEW>>) (Class<? extends Vertex>) Vertex.class;
		TypeInformation<K> idType = ((TupleTypeInfo<Vertex<K, OLD>>) vertices.getType()).getTypeAt(0);
		TypeInformation<OLD> oldType = ((TupleTypeInfo<Vertex<K, OLD>>) vertices.getType()).getTypeAt(1);
		TypeInformation<NEW> newType = TypeExtractor.getUnaryOperatorReturnType(
			translator,
			TranslateFunction.class,
			0,
			1,
			new int[]{1},
			oldType,
			null,
			false);

		TupleTypeInfo<Vertex<K, NEW>> returnType = new TupleTypeInfo<>(vertexClass, idType, newType);

		return vertices
			.map(new TranslateVertexValue<>(translator))
			.returns(returnType)
				.setParallelism(parallelism)
				.name("Translate vertex values");
	}
}