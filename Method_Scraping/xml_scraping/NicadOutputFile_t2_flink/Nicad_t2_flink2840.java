// clone pairs:28161:70%
// 44393:flink/flink-libraries/flink-gelly/src/main/java/org/apache/flink/graph/asm/translate/Translate.java

public class Nicad_t2_flink2840
{
	public static <OLD, NEW, EV> DataSet<Edge<NEW, EV>> translateEdgeIds(DataSet<Edge<OLD, EV>> edges, TranslateFunction<OLD, NEW> translator, int parallelism) {
		Preconditions.checkNotNull(edges);
		Preconditions.checkNotNull(translator);

		Class<Edge<NEW, EV>> edgeClass = (Class<Edge<NEW, EV>>) (Class<? extends Edge>) Edge.class;
		TypeInformation<OLD> oldType = ((TupleTypeInfo<Edge<OLD, EV>>) edges.getType()).getTypeAt(0);
		TypeInformation<NEW> newType = TypeExtractor.getUnaryOperatorReturnType(
			translator,
			TranslateFunction.class,
			0,
			1,
			new int[] {1},
			oldType,
			null,
			false);
		TypeInformation<EV> edgeValueType = ((TupleTypeInfo<Edge<OLD, EV>>) edges.getType()).getTypeAt(2);

		TupleTypeInfo<Edge<NEW, EV>> returnType = new TupleTypeInfo<>(edgeClass, newType, newType, edgeValueType);

		return edges
			.map(new TranslateEdgeId<>(translator))
			.returns(returnType)
				.setParallelism(parallelism)
				.name("Translate edge IDs");
	}
}