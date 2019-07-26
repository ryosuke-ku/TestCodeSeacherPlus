// clone pairs:10612:100%
// 11575:flink/flink-java/src/main/java/org/apache/flink/api/java/operators/CoGroupOperator.java

public class Nicad_t2_flink527
{
	public DualInputSemanticProperties getSemanticProperties() {

		DualInputSemanticProperties props = super.getSemanticProperties();

		// offset semantic information by extracted key fields
		if (props != null &&
					(this.keys1 instanceof SelectorFunctionKeys ||
					this.keys2 instanceof SelectorFunctionKeys)) {

			int numFields1 = this.getInput1Type().getTotalFields();
			int numFields2 = this.getInput2Type().getTotalFields();
			int offset1 = (this.keys1 instanceof SelectorFunctionKeys) ?
					((SelectorFunctionKeys<?, ?>) this.keys1).getKeyType().getTotalFields() : 0;
			int offset2 = (this.keys2 instanceof SelectorFunctionKeys) ?
					((SelectorFunctionKeys<?, ?>) this.keys2).getKeyType().getTotalFields() : 0;

			props = SemanticPropUtil.addSourceFieldOffsets(props, numFields1, numFields2, offset1, offset2);
		}

		return props;
	}
}