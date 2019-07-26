// clone pairs:300:98%
// 532:flink/flink-connectors/flink-connector-cassandra/src/main/java/org/apache/flink/streaming/connectors/cassandra/CassandraTupleWriteAheadSink.java

public class Nicad_t1_flink_new29
{
	protected boolean sendValues(Iterable<IN> values, long checkpointId, long timestamp) throws Exception {
		final AtomicInteger updatesCount = new AtomicInteger(0);
		final AtomicInteger updatesConfirmed = new AtomicInteger(0);

		final AtomicReference<Throwable> exception = new AtomicReference<>();

		FutureCallback<ResultSet> callback = new FutureCallback<ResultSet>() {
			@Override
			public void onSuccess(ResultSet resultSet) {
				updatesConfirmed.incrementAndGet();
				if (updatesCount.get() > 0) { // only set if all updates have been sent
					if (updatesCount.get() == updatesConfirmed.get()) {
						synchronized (updatesConfirmed) {
							updatesConfirmed.notifyAll();
						}
					}
				}
			}

			@Override
			public void onFailure(Throwable throwable) {
				if (exception.compareAndSet(null, throwable)) {
					LOG.error("Error while sending value.", throwable);
					synchronized (updatesConfirmed) {
						updatesConfirmed.notifyAll();
					}
				}
			}
		};

		//set values for prepared statement
		int updatesSent = 0;
		for (IN value : values) {
			for (int x = 0; x < value.getArity(); x++) {
				fields[x] = value.getField(x);
			}
			//insert values and send to cassandra
			BoundStatement s = preparedStatement.bind(fields);
			s.setDefaultTimestamp(timestamp);
			ResultSetFuture result = session.executeAsync(s);
			updatesSent++;
			if (result != null) {
				//add callback to detect errors
				Futures.addCallback(result, callback);
			}
		}
		updatesCount.set(updatesSent);

		synchronized (updatesConfirmed) {
			while (exception.get() == null && updatesSent != updatesConfirmed.get()) {
				updatesConfirmed.wait();
			}
		}

		if (exception.get() != null) {
			LOG.warn("Sending a value failed.", exception.get());
			return false;
		} else {
			return true;
		}
	}
}