// clone pairs:10205:90%
// 11188:flink/flink-optimizer/src/main/java/org/apache/flink/optimizer/plantranslate/JobGraphGenerator.java

public class Nicad_t2_flink488
{
	private InputFormatVertex createDataSourceVertex(SourcePlanNode node) throws CompilerException {
		final InputFormatVertex vertex = new InputFormatVertex(node.getNodeName());
		final TaskConfig config = new TaskConfig(vertex.getConfiguration());

		vertex.setResources(node.getMinResources(), node.getPreferredResources());
		vertex.setInvokableClass(DataSourceTask.class);
		vertex.setFormatDescription(getDescriptionForUserCode(node.getProgramOperator().getUserCodeWrapper()));

		// set user code
		config.setStubWrapper(node.getProgramOperator().getUserCodeWrapper());
		config.setStubParameters(node.getProgramOperator().getParameters());

		config.setOutputSerializer(node.getSerializer());
		return vertex;
	}
}