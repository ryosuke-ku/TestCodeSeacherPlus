// clone pairs:11337:70%
// 12751:flink/flink-connectors/flink-connector-rabbitmq/src/main/java/org/apache/flink/streaming/connectors/rabbitmq/RMQSource.java

public class Nicad_t1_flink_new2674
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