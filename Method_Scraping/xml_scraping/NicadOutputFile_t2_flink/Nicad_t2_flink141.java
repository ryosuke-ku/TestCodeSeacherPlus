// clone pairs:5652:83%
// 5999:flink/flink-runtime/src/main/java/org/apache/flink/runtime/operators/sort/NormalizedKeySorter.java

public class Nicad_t2_flink141
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