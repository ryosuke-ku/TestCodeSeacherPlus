// clone pairs:10115:72%
// 11081:flink/flink-core/src/main/java/org/apache/flink/core/fs/LimitedConnectionsFileSystem.java

public class Nicad_t2_flink472
{
	void unregisterOutputStream(OutStream stream) {
		lock.lock();
		try {
			// only decrement if we actually remove the stream
			if (openOutputStreams.remove(stream)) {
				numReservedOutputStreams--;
				available.signalAll();
			}
		}
		finally {
			lock.unlock();
		}
	}
}