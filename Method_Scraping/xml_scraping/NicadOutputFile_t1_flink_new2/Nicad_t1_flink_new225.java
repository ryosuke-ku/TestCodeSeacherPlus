// clone pairs:2667:100%
// 3978:flink/flink-runtime/src/main/java/org/apache/flink/runtime/executiongraph/ArchivedExecutionGraph.java

public class Nicad_t1_flink_new225
{
	public Iterable<ArchivedExecutionJobVertex> getVerticesTopologically() {
		// we return a specific iterator that does not fail with concurrent modifications
		// the list is append only, so it is safe for that
		final int numElements = this.verticesInCreationOrder.size();

		return new Iterable<ArchivedExecutionJobVertex>() {
			@Override
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
		};
	}
}