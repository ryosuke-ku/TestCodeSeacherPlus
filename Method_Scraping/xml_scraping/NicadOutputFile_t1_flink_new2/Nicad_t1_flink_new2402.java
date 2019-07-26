// clone pairs:9175:75%
// 10303:flink/flink-runtime/src/main/java/org/apache/flink/runtime/taskmanager/NetworkEnvironmentConfiguration.java

public class Nicad_t1_flink_new2402
{
	public NetworkEnvironmentConfiguration(
			int numNetworkBuffers,
			int networkBufferSize,
			int partitionRequestInitialBackoff,
			int partitionRequestMaxBackoff,
			int networkBuffersPerChannel,
			int floatingNetworkBuffersPerGate,
			boolean isCreditBased,
			boolean isNetworkDetailedMetrics,
			@Nullable NettyConfig nettyConfig) {

		this.numNetworkBuffers = numNetworkBuffers;
		this.networkBufferSize = networkBufferSize;
		this.partitionRequestInitialBackoff = partitionRequestInitialBackoff;
		this.partitionRequestMaxBackoff = partitionRequestMaxBackoff;
		this.networkBuffersPerChannel = networkBuffersPerChannel;
		this.floatingNetworkBuffersPerGate = floatingNetworkBuffersPerGate;
		this.isCreditBased = isCreditBased;
		this.isNetworkDetailedMetrics = isNetworkDetailedMetrics;
		this.nettyConfig = nettyConfig;
	}
}