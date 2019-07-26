// clone pairs:10283:72%
// 11332:flink/flink-core/src/main/java/org/apache/flink/core/fs/LimitedConnectionsFileSystem.java

public class Nicad_t2_flink504
{
	void unregisterInputStream(InStream stream) {
		lock.lock();
		try {
			// only decrement if we actually remove the stream
			if (openInputStreams.remove(stream)) {
				numReservedInputStreams--;
				available.signalAll();
			}
		}
		finally {
			lock.unlock();
		}
	}
}