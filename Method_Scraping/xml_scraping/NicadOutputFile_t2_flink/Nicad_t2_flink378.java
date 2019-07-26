// clone pairs:9689:83%
// 10566:flink/flink-streaming-java/src/main/java/org/apache/flink/streaming/api/operators/StreamGroupedFold.java

public class Nicad_t2_flink378
{
	public void processElement(StreamRecord<IN> element) throws Exception {
		OUT value = values.value();

		if (value != null) {
			OUT folded = userFunction.fold(outTypeSerializer.copy(value), element.getValue());
			values.update(folded);
			output.collect(element.replace(folded));
		} else {
			OUT first = userFunction.fold(outTypeSerializer.copy(initialValue), element.getValue());
			values.update(first);
			output.collect(element.replace(first));
		}
	}
}