// clone pairs:344:86%
// 602:flink/flink-core/src/main/java/org/apache/flink/api/common/operators/base/OuterJoinOperatorBase.java

public class Nicad_t1_flink_new212
{
		private boolean nextGroups() throws IOException {
			boolean firstEmpty = true;
			boolean secondEmpty = true;

			if (this.matchStatus != MatchStatus.FIRST_EMPTY) {
				if (this.matchStatus == MatchStatus.FIRST_REMAINED) {
					// comparator is still set correctly
					firstEmpty = false;
				} else {
					if (this.leftGroupedIterator.nextKey()) {
						this.pairComparator.setReference(leftGroupedIterator.getValues().getCurrent());
						firstEmpty = false;
					}
				}
			}

			if (this.matchStatus != MatchStatus.SECOND_EMPTY) {
				if (this.matchStatus == MatchStatus.SECOND_REMAINED) {
					secondEmpty = false;
				} else {
					if (rightGroupedIterator.nextKey()) {
						secondEmpty = false;
					}
				}
			}

			if (firstEmpty && secondEmpty) {
				// both inputs are empty
				return false;
			} else if (firstEmpty && !secondEmpty) {
				// input1 is empty, input2 not
				this.currLeftSubset = Collections.singleton(null);
				this.currRightSubset = this.rightGroupedIterator.getValues();
				this.matchStatus = MatchStatus.FIRST_EMPTY;
				return true;
			} else if (!firstEmpty && secondEmpty) {
				// input1 is not empty, input 2 is empty
				this.currLeftSubset = this.leftGroupedIterator.getValues();
				this.currRightSubset = Collections.singleton(null);
				this.matchStatus = MatchStatus.SECOND_EMPTY;
				return true;
			} else {
				// both inputs are not empty
				final int comp = this.pairComparator.compareToReference(rightGroupedIterator.getValues().getCurrent());

				if (0 == comp) {
					// keys match
					this.currLeftSubset = this.leftGroupedIterator.getValues();
					this.currRightSubset = this.rightGroupedIterator.getValues();
					this.matchStatus = MatchStatus.NONE_REMAINED;
				} else if (0 < comp) {
					// key1 goes first
					this.currLeftSubset = this.leftGroupedIterator.getValues();
					this.currRightSubset = Collections.singleton(null);
					this.matchStatus = MatchStatus.SECOND_REMAINED;
				} else {
					// key 2 goes first
					this.currLeftSubset = Collections.singleton(null);
					this.currRightSubset = this.rightGroupedIterator.getValues();
					this.matchStatus = MatchStatus.FIRST_REMAINED;
				}
				return true;
			}
		}
}