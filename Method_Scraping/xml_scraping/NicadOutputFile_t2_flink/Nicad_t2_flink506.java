// clone pairs:10285:72%
// 11336:flink/flink-core/src/main/java/org/apache/flink/core/fs/LimitedConnectionsFileSystem.java

public class Nicad_t2_flink506
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