// clone pairs:6902:73%
// 7046:flink/flink-streaming-java/src/main/java/org/apache/flink/streaming/api/operators/StreamTaskStateInitializerImpl.java

public class Nicad_t2_flink251
{
		public KeyGroupStatePartitionStreamProvider next() {

			if (!hasNext()) {

				throw new NoSuchElementException("Iterator exhausted");
			}

			Tuple2<Integer, Long> keyGroupOffset = currentOffsetsIterator.next();
			try {
				if (null == currentStream) {
					openCurrentStream();
				}

				currentStream.seek(keyGroupOffset.f1);
				return new KeyGroupStatePartitionStreamProvider(currentStream, keyGroupOffset.f0);

			} catch (IOException ioex) {
				return new KeyGroupStatePartitionStreamProvider(ioex, keyGroupOffset.f0);
			}
		}
}