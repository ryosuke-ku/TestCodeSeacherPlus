// clone pairs:10289:72%
// 11344:flink/flink-core/src/main/java/org/apache/flink/core/fs/LimitedConnectionsFileSystem.java

public class Nicad_t2_flink510
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