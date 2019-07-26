// clone pairs:7551:71%
// 7507:flink/flink-streaming-java/src/main/java/org/apache/flink/streaming/api/graph/StreamGraphGenerator.java

public class Nicad_t2_flink277
{
	private <T> Collection<Integer> transformSplit(SplitTransformation<T> split) {

		StreamTransformation<T> input = split.getInput();
		Collection<Integer> resultIds = transform(input);

		validateSplitTransformation(input);

		// the recursive transform call might have transformed this already
		if (alreadyTransformed.containsKey(split)) {
			return alreadyTransformed.get(split);
		}

		for (int inputId : resultIds) {
			streamGraph.addOutputSelector(inputId, split.getOutputSelector());
		}

		return resultIds;
	}
}