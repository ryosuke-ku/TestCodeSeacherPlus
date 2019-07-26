// clone pairs:10797:72%
// 11899:flink/flink-streaming-java/src/main/java/org/apache/flink/streaming/runtime/tasks/OperatorChain.java

public class Nicad_t2_flink600
{
		public void collect(StreamRecord<T> record) {

			for (int i = 0; i < outputs.length - 1; i++) {
				Output<StreamRecord<T>> output = outputs[i];
				StreamRecord<T> shallowCopy = record.copy(record.getValue());
				output.collect(shallowCopy);
			}

			if (outputs.length > 0) {
				// don't copy for the last output
				outputs[outputs.length - 1].collect(record);
			}
		}
}