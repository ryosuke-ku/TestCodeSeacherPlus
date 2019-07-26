// clone pairs:4697:72%
// 5302:flink/flink-connectors/flink-connector-cassandra/src/main/java/org/apache/flink/streaming/connectors/cassandra/CassandraSinkBase.java

public class Nicad_t1_flink_new239
{
	public void close() throws Exception {
		try {
			checkAsyncErrors();
			flush();
			checkAsyncErrors();
		} finally {
			try {
				if (session != null) {
					session.close();
				}
			} catch (Exception e) {
				log.error("Error while closing session.", e);
			}
			try {
				if (cluster != null) {
					cluster.close();
				}
			} catch (Exception e) {
				log.error("Error while closing cluster.", e);
			}
		}
	}
}