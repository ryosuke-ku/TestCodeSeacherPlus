// clone pairs:8303:100%
// 8687:flink/flink-libraries/flink-gelly/src/main/java/org/apache/flink/graph/bipartite/BipartiteGraph.java

public class Nicad_t2_flink311
{
		public void join(Tuple5<KT, KB, EV, VVT, VVB> first, Tuple5<KT, KB, EV, VVT, VVB> second, Collector<Edge<KT, Projection<KB, VVB, VVT, EV>>> out)
				throws Exception {
			if (!first.f0.equals(second.f0)) {
				edge.f0 = first.f0;
				edge.f1 = second.f0;

				projection.f0 = first.f1;
				projection.f1 = first.f4;
				projection.f2 = first.f3;
				projection.f3 = second.f3;
				projection.f4 = first.f2;
				projection.f5 = second.f2;

				out.collect(edge);
			}
		}
}