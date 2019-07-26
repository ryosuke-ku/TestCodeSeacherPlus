// clone pairs:293:74%
// 519:flink/flink-runtime/src/main/java/org/apache/flink/runtime/operators/ReduceDriver.java

public class Nicad_t1_flink_new27
{
	public void run() throws Exception {
		if (LOG.isDebugEnabled()) {
			LOG.debug(this.taskContext.formatLogString("Reducer preprocessing done. Running Reducer code."));
		}

		final Counter numRecordsIn = this.taskContext.getMetricGroup().getIOMetricGroup().getNumRecordsInCounter();
		final Counter numRecordsOut = this.taskContext.getMetricGroup().getIOMetricGroup().getNumRecordsOutCounter();

		// cache references on the stack
		final MutableObjectIterator<T> input = this.input;
		final TypeSerializer<T> serializer = this.serializer;
		final TypeComparator<T> comparator = this.comparator;
		
		final ReduceFunction<T> function = this.taskContext.getStub();
		
		final Collector<T> output = new CountingCollector<>(this.taskContext.getOutputCollector(), numRecordsOut);

		if (objectReuseEnabled) {
			// We only need two objects. The first reference stores results and is
			// eventually collected. New values are read into the second.
			//
			// The output value must have the same key fields as the input values.

			T reuse1 = input.next();
			T reuse2 = serializer.createInstance();

			T value = reuse1;

			// iterate over key groups
			while (this.running && value != null) {
				numRecordsIn.inc();
				comparator.setReference(value);

				// iterate within a key group
				while ((reuse2 = input.next(reuse2)) != null) {
					numRecordsIn.inc();
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
			while (this.running && value != null) {
				numRecordsIn.inc();
				comparator.setReference(value);
				T res = value;

				// iterate within a key group
				while ((value = input.next()) != null) {
					numRecordsIn.inc();
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