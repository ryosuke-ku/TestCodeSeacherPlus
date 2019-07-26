// clone pairs:10222:72%
// 11220:flink/flink-runtime/src/main/java/org/apache/flink/runtime/io/network/NetworkEnvironment.java

public class Nicad_t2_flink491
{
	private NetworkEnvironment(
			ResourceID taskExecutorLocation,
			NetworkEnvironmentConfiguration config,
			NetworkBufferPool networkBufferPool,
			ConnectionManager connectionManager,
			ResultPartitionManager resultPartitionManager,
			ResultPartitionFactory resultPartitionFactory,
			SingleInputGateFactory singleInputGateFactory) {
		this.taskExecutorLocation = taskExecutorLocation;
		this.config = config;
		this.networkBufferPool = networkBufferPool;
		this.connectionManager = connectionManager;
		this.resultPartitionManager = resultPartitionManager;
		this.inputGatesById = new ConcurrentHashMap<>();
		this.resultPartitionFactory = resultPartitionFactory;
		this.singleInputGateFactory = singleInputGateFactory;
		this.isShutdown = false;
	}
}