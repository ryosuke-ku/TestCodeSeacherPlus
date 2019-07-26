// clone pairs:10725:81%
// 11690:flink/flink-streaming-java/src/main/java/org/apache/flink/streaming/api/datastream/CoGroupedStreams.java

public class Nicad_t1_flink_new2494
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
			this.input1 = input1;
			this.input2 = input2;

			this.keySelector1 = keySelector1;
			this.keySelector2 = keySelector2;
			this.keyType = keyType;

			this.windowAssigner = windowAssigner;
			this.trigger = trigger;
			this.evictor = evictor;

			this.allowedLateness = allowedLateness;
		}
}