// clone pairs:1304:80%
// 631:kafka/streams/src/main/java/org/apache/kafka/streams/processor/internals/StreamThread.java

public class Nicad_t1_kafka_new55
{
        public void AbstractTaskCreator(final InternalTopologyBuilder builder,
                            final StreamsConfig config,
                            final StreamsMetricsImpl streamsMetrics,
                            final StateDirectory stateDirectory,
                            final ChangelogReader storeChangelogReader,
                            final Time time,
                            final Logger log) {
            this.applicationId = config.getString(StreamsConfig.APPLICATION_ID_CONFIG);
            this.builder = builder;
            this.config = config;
            this.streamsMetrics = streamsMetrics;
            this.stateDirectory = stateDirectory;
            this.storeChangelogReader = storeChangelogReader;
            this.time = time;
            this.log = log;
        }
}