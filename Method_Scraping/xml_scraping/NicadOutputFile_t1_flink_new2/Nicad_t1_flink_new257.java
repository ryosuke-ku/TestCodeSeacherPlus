// clone pairs:5653:94%
// 5990:flink/flink-runtime/src/main/java/org/apache/flink/runtime/operators/sort/NormalizedKeySorter.java

public class Nicad_t1_flink_new257
{
			public T next(T target) {
				if (this.current < this.size) {
					this.current++;
					if (this.currentOffset > lastIndexEntryOffset) {
						this.currentOffset = 0;
						this.currentIndexSegment = sortIndex.get(++this.currentSegment);
					}
					
					long pointer = this.currentIndexSegment.getLong(this.currentOffset) & POINTER_MASK;
					this.currentOffset += indexEntrySize;
					
					try {
						return getRecordFromBuffer(target, pointer);
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