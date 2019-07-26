// clone pairs:5657:88%
// 5998:flink/flink-runtime/src/main/java/org/apache/flink/runtime/operators/sort/NormalizedKeySorter.java

public class Nicad_t1_flink_new259
{
			public T next()
			{
				if (this.current < this.size) {
					this.current++;
					if (this.currentOffset > lastIndexEntryOffset) {
						this.currentOffset = 0;
						this.currentIndexSegment = sortIndex.get(++this.currentSegment);
					}

					long pointer = this.currentIndexSegment.getLong(this.currentOffset);
					this.currentOffset += indexEntrySize;

					try {
						return getRecordFromBuffer(pointer);
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