// clone pairs:6441:100%
// 6576:flink/flink-runtime/src/main/java/org/apache/flink/runtime/executiongraph/ArchivedExecutionGraph.java

public class Nicad_t2_flink191
{
		public boolean hasNext() {
			while (true) {
				if (currVertices != null) {
					if (currPos < currVertices.length) {
						return true;
					} else {
						currVertices = null;
					}
				} else if (jobVertices.hasNext()) {
					currVertices = jobVertices.next().getTaskVertices();
					currPos = 0;
				} else {
					return false;
				}
			}
		}
}