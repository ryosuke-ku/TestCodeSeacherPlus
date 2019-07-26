// clone pairs:11768:70%
// 13574:flink/flink-connectors/flink-connector-rabbitmq/src/main/java/org/apache/flink/streaming/connectors/rabbitmq/RMQSource.java

public class Nicad_t1_flink_new2867
{
	public void close() throws Exception {
		super.close();
		try {
			if (connection != null) {
				connection.close();
			}
		} catch (IOException e) {
			throw new RuntimeException("Error while closing RMQ connection with " + queueName
				+ " at " + rmqConnectionConfig.getHost(), e);
		}
	}
}