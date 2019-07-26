// clone pairs:10751:72%
// 11808:flink/flink-connectors/flink-connector-rabbitmq/src/main/java/org/apache/flink/streaming/connectors/rabbitmq/common/RMQConnectionConfig.java

public class Nicad_t2_flink589
{
	private RMQConnectionConfig(String uri, Integer networkRecoveryInterval, Boolean automaticRecovery,
								Boolean topologyRecovery, Integer connectionTimeout, Integer requestedChannelMax,
								Integer requestedFrameMax, Integer requestedHeartbeat){
		Preconditions.checkNotNull(uri, "Uri can not be null");
		this.uri = uri;

		this.networkRecoveryInterval = networkRecoveryInterval;
		this.automaticRecovery = automaticRecovery;
		this.topologyRecovery = topologyRecovery;
		this.connectionTimeout = connectionTimeout;
		this.requestedChannelMax = requestedChannelMax;
		this.requestedFrameMax = requestedFrameMax;
		this.requestedHeartbeat = requestedHeartbeat;
	}
}