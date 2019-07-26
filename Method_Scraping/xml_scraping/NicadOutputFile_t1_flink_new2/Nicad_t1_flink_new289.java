// clone pairs:6402:75%
// 6517:flink/flink-runtime/src/main/java/org/apache/flink/runtime/io/disk/SeekableFileChannelInputView.java

public class Nicad_t1_flink_new289
{
	private void close(boolean deleteFile) throws IOException {
		try {
			clear();
			if (deleteFile) {
				reader.closeAndDelete();
			} else {
				reader.close();
			}
		} finally {
			synchronized (memory) {
				memManager.release(memory);
				memory.clear();
			}
		}
	}
}