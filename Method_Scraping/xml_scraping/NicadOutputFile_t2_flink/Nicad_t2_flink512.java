// clone pairs:10291:72%
// 11348:flink/flink-core/src/main/java/org/apache/flink/core/fs/LimitedConnectionsFileSystem.java

public class Nicad_t2_flink512
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