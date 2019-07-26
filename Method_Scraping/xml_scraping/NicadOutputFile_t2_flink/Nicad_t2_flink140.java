// clone pairs:5647:88%
// 5993:flink/flink-runtime/src/main/java/org/apache/flink/runtime/operators/sort/FixedLengthRecordSorter.java

public class Nicad_t2_flink140
{
			public T next(T reuse) {
				if (this.currentTotal < this.numTotal) {
					
					if (this.currentInSegment >= this.numPerSegment) {
						this.currentInSegment = 0;
						this.currentSegmentIndex++;
						this.in.set(sortBuffer.get(this.currentSegmentIndex), 0);
					}
					
					this.currentTotal++;
					this.currentInSegment++;
					
					try {
						return this.comp.readWithKeyDenormalization(reuse, this.in);
					}
					catch (IOException ioe) {
						throw new RuntimeException(ioe);
					}
				}
				else {
					return null;
				}
			}
}