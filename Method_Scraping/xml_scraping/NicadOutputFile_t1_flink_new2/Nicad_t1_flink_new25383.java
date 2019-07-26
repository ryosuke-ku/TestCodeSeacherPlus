// clone pairs:23378:90%
// 34696:flink/flink-runtime/src/main/java/org/apache/flink/runtime/taskmanager/NetworkEnvironmentConfiguration.java

public class Nicad_t1_flink_new25383
{
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		else if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		else {
			final NetworkEnvironmentConfiguration that = (NetworkEnvironmentConfiguration) obj;

			return this.numNetworkBuffers == that.numNetworkBuffers &&
					this.networkBufferSize == that.networkBufferSize &&
					this.partitionRequestInitialBackoff == that.partitionRequestInitialBackoff &&
					this.partitionRequestMaxBackoff == that.partitionRequestMaxBackoff &&
					this.networkBuffersPerChannel == that.networkBuffersPerChannel &&
					this.floatingNetworkBuffersPerGate == that.floatingNetworkBuffersPerGate &&
					this.isCreditBased == that.isCreditBased &&
					(nettyConfig != null ? nettyConfig.equals(that.nettyConfig) : that.nettyConfig == null);
		}
	}
}