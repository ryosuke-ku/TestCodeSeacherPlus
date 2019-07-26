// clone pairs:10237:72%
// 11192:flink/flink-optimizer/src/main/java/org/apache/flink/optimizer/dag/CoGroupNode.java

public class Nicad_t1_flink_new2462
{
	public void makeCoGroupWithSolutionSet(int solutionsetInputIndex) {
		OperatorDescriptorDual op;
		if (solutionsetInputIndex == 0) {
			op = new CoGroupWithSolutionSetFirstDescriptor(keys1, keys2);
		} else if (solutionsetInputIndex == 1) {
			op = new CoGroupWithSolutionSetSecondDescriptor(keys1, keys2);
		} else {
			throw new IllegalArgumentException();
		}
		this.dataProperties = Collections.<OperatorDescriptorDual>singletonList(op);
	}
}