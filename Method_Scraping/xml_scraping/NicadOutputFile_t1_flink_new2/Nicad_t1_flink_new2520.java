// clone pairs:10849:81%
// 11849:flink/flink-connectors/flink-connector-cassandra/src/main/java/org/apache/flink/streaming/connectors/cassandra/CassandraTupleWriteAheadSink.java

public class Nicad_t1_flink_new2520
{
	public void open() throws Exception {
		super.open();
		if (!getRuntimeContext().isCheckpointingEnabled()) {
			throw new IllegalStateException("The write-ahead log requires checkpointing to be enabled.");
		}
		cluster = builder.getCluster();
		session = cluster.connect();
		preparedStatement = session.prepare(insertQuery);

		fields = new Object[((TupleSerializer<IN>) serializer).getArity()];
	}
}