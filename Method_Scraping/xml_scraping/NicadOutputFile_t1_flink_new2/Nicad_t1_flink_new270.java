// clone pairs:5850:88%
// 6202:flink/flink-connectors/flink-connector-cassandra/src/main/java/org/apache/flink/streaming/connectors/cassandra/CassandraTupleWriteAheadSink.java

public class Nicad_t1_flink_new270
{
	public void close() throws Exception {
		super.close();
		try {
			if (session != null) {
				session.close();
			}
		} catch (Exception e) {
			LOG.error("Error while closing session.", e);
		}
		try {
			if (cluster != null) {
				cluster.close();
			}
		} catch (Exception e) {
			LOG.error("Error while closing cluster.", e);
		}
	}
}