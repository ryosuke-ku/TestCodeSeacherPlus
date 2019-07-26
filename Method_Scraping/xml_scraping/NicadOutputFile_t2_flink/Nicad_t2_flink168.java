// clone pairs:5873:94%
// 6230:flink/flink-optimizer/src/main/java/org/apache/flink/optimizer/dag/GroupReduceNode.java

public class Nicad_t2_flink168
{
	protected SemanticProperties getSemanticPropertiesForLocalPropertyFiltering() {
		// Local properties for GroupReduce may only be preserved on key fields.
		SingleInputSemanticProperties origProps = getOperator().getSemanticProperties();
		SingleInputSemanticProperties filteredProps = new SingleInputSemanticProperties();
		FieldSet readSet = origProps.getReadFields(0);
		if(readSet != null) {
			filteredProps.addReadFields(readSet);
		}

		// only add forward field information for key fields
		if(this.keys != null) {
			for (int f : this.keys) {
				FieldSet targets = origProps.getForwardingTargetFields(0, f);
				for (int t : targets) {
					filteredProps.addForwardedField(f, t);
				}
			}
		}
		return filteredProps;
	}
}