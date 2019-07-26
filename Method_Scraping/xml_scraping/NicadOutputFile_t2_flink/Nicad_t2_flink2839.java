// clone pairs:28160:70%
// 44391:flink/flink-libraries/flink-gelly/src/main/java/org/apache/flink/graph/asm/translate/Translate.java

public class Nicad_t2_flink2839
{
	public static <OLD, NEW, VV> DataSet<Vertex<NEW, VV>> translateVertexIds(DataSet<Vertex<OLD, VV>> vertices, TranslateFunction<OLD, NEW> translator, int parallelism) {
		Preconditions.checkNotNull(vertices);
		Preconditions.checkNotNull(translator);

		Class<Vertex<NEW, VV>> vertexClass = (Class<Vertex<NEW, VV>>) (Class<? extends Vertex>) Vertex.class;
		TypeInformation<OLD> oldType = ((TupleTypeInfo<Vertex<OLD, VV>>) vertices.getType()).getTypeAt(0);
		TypeInformation<NEW> newType = TypeExtractor.getUnaryOperatorReturnType(
			translator,
			TranslateFunction.class,
			0,
			1,
			new int[]{1},
			oldType,
			null,
			false);
		TypeInformation<VV> vertexValueType = ((TupleTypeInfo<Vertex<OLD, VV>>) vertices.getType()).getTypeAt(1);

		TupleTypeInfo<Vertex<NEW, VV>> returnType = new TupleTypeInfo<>(vertexClass, newType, vertexValueType);

		return vertices
			.map(new TranslateVertexId<>(translator))
			.returns(returnType)
				.setParallelism(parallelism)
				.name("Translate vertex IDs");
	}
}