// clone pairs:4792:72%
// 5403:flink/flink-runtime/src/main/java/org/apache/flink/runtime/executiongraph/ArchivedExecutionGraph.java

public class Nicad_t1_flink_new240
{
			public Iterator<ArchivedExecutionJobVertex> iterator() {
				return new Iterator<ArchivedExecutionJobVertex>() {
					private int pos = 0;

					@Override
					public boolean hasNext() {
						return pos < numElements;
					}

					@Override
					public ArchivedExecutionJobVertex next() {
						if (hasNext()) {
							return verticesInCreationOrder.get(pos++);
						} else {
							throw new NoSuchElementException();
						}
					}

					@Override
					public void remove() {
						throw new UnsupportedOperationException();
					}
				};
			}
}