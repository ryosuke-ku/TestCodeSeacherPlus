// clone pairs:9697:91%
// 10581:flink/flink-core/src/main/java/org/apache/flink/api/common/operators/util/FieldSet.java

public class Nicad_t2_flink381
{
	public FieldSet(int... fieldIDs) {
		if (fieldIDs == null || fieldIDs.length == 0) {
			this.collection = Collections.emptySet();
		} else {
			HashSet<Integer> set = new HashSet<Integer>(2 * fieldIDs.length);
			for (int i = 0; i < fieldIDs.length; i++) {
				set.add(fieldIDs[i]);
			}
			
			this.collection = Collections.unmodifiableSet(set);
		}
	}
}