// clone pairs:5420:75%
// 5827:flink/flink-core/src/main/java/org/apache/flink/api/common/operators/base/OuterJoinOperatorBase.java

public class Nicad_t1_flink_new251
{
		public OuterJoinListIterator(List<IN1> leftInput, TypeSerializer<IN1> leftSerializer, final TypeComparator<IN1> leftComparator,
				List<IN2> rightInput, TypeSerializer<IN2> rightSerializer, final TypeComparator<IN2> rightComparator,
				OuterJoinType outerJoinType) {
			this.outerJoinType = outerJoinType;
			pairComparator = new GenericPairComparator<>(leftComparator, rightComparator);
			leftGroupedIterator = new ListKeyGroupedIterator<>(leftInput, leftSerializer, leftComparator);
			rightGroupedIterator = new ListKeyGroupedIterator<>(rightInput, rightSerializer, rightComparator);
			// ----------------------------------------------------------------
			// Sort
			// ----------------------------------------------------------------
			Collections.sort(leftInput, new Comparator<IN1>() {
				@Override
				public int compare(IN1 o1, IN1 o2) {
					return leftComparator.compare(o1, o2);
				}
			});

			Collections.sort(rightInput, new Comparator<IN2>() {
				@Override
				public int compare(IN2 o1, IN2 o2) {
					return rightComparator.compare(o1, o2);
				}
			});

		}
}