// clone pairs:10613:100%
// 11577:flink/flink-java/src/main/java/org/apache/flink/api/java/operators/GroupReduceOperator.java

public class Nicad_t2_flink528
{
	public SingleInputSemanticProperties getSemanticProperties() {

		SingleInputSemanticProperties props = super.getSemanticProperties();

		// offset semantic information by extracted key fields
		if (props != null &&
				this.grouper != null &&
				this.grouper.keys instanceof SelectorFunctionKeys) {

			int offset = ((SelectorFunctionKeys<?, ?>) this.grouper.keys).getKeyType().getTotalFields();
			if (this.grouper instanceof SortedGrouping) {
				offset += ((SortedGrouping<?>) this.grouper).getSortSelectionFunctionKey().getKeyType().getTotalFields();
			}
			props = SemanticPropUtil.addSourceFieldOffset(props, this.getInputType().getTotalFields(), offset);
		}

		return props;
	}
}