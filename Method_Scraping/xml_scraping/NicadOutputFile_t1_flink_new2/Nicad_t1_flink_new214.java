// clone pairs:452:100%
// 772:flink/flink-runtime/src/main/java/org/apache/flink/runtime/operators/ReduceCombineDriver.java

public class Nicad_t1_flink_new214
{
	private void sortAndCombine() throws Exception {
		final InMemorySorter<T> sorter = this.sorter;

		if (!sorter.isEmpty()) {
			sortAlgo.sort(sorter);

			final TypeSerializer<T> serializer = this.serializer;
			final TypeComparator<T> comparator = this.comparator;
			final ReduceFunction<T> function = this.reducer;
			final Collector<T> output = this.output;
			final MutableObjectIterator<T> input = sorter.getIterator();

			if (objectReuseEnabled) {
				// We only need two objects. The first reference stores results and is
				// eventually collected. New values are read into the second.
				//
				// The output value must have the same key fields as the input values.

				T reuse1 = input.next();
				T reuse2 = serializer.createInstance();

				T value = reuse1;

				// iterate over key groups
				while (running && value != null) {
					comparator.setReference(value);

					// iterate within a key group
					while ((reuse2 = input.next(reuse2)) != null) {
						if (comparator.equalToReference(reuse2)) {
							// same group, reduce
							value = function.reduce(value, reuse2);

							// we must never read into the object returned
							// by the user, so swap the reuse objects
							if (value == reuse2) {
								T tmp = reuse1;
								reuse1 = reuse2;
								reuse2 = tmp;
							}
						} else {
							// new key group
							break;
						}
					}

					output.collect(value);

					// swap the value from the new key group into the first object
					T tmp = reuse1;
					reuse1 = reuse2;
					reuse2 = tmp;

					value = reuse1;
				}
			} else {
				T value = input.next();

				// iterate over key groups
				while (running && value != null) {
					comparator.setReference(value);
					T res = value;

					// iterate within a key group
					while ((value = input.next()) != null) {
						if (comparator.equalToReference(value)) {
							// same group, reduce
							res = function.reduce(res, value);
						} else {
							// new key group
							break;
						}
					}

					output.collect(res);
				}
			}
		}
	}
}