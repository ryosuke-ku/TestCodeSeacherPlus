// clone pairs:10224:72%
// 11166:flink/flink-streaming-java/src/main/java/org/apache/flink/streaming/api/datastream/JoinedStreams.java

public class Nicad_t1_flink_new2461
{
		protected WithWindow(DataStream<T1> input1,
				DataStream<T2> input2,
				KeySelector<T1, KEY> keySelector1,
				KeySelector<T2, KEY> keySelector2,
				TypeInformation<KEY> keyType,
				WindowAssigner<? super TaggedUnion<T1, T2>, W> windowAssigner,
				Trigger<? super TaggedUnion<T1, T2>, ? super W> trigger,
				Evictor<? super TaggedUnion<T1, T2>, ? super W> evictor,
				Time allowedLateness) {

			this.input1 = requireNonNull(input1);
			this.input2 = requireNonNull(input2);

			this.keySelector1 = requireNonNull(keySelector1);
			this.keySelector2 = requireNonNull(keySelector2);
			this.keyType = requireNonNull(keyType);

			this.windowAssigner = requireNonNull(windowAssigner);

			this.trigger = trigger;
			this.evictor = evictor;

			this.allowedLateness = allowedLateness;
		}
}