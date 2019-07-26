// clone pairs:826:71%
// 349:kafka/streams/src/main/java/org/apache/kafka/streams/processor/internals/TaskManager.java

public class Nicad_t1_kafka_new24
{
    public void TaskManager(final ChangelogReader changelogReader,
                final UUID processId,
                final String logPrefix,
                final Consumer<byte[], byte[]> restoreConsumer,
                final StreamsMetadataState streamsMetadataState,
                final StreamThread.AbstractTaskCreator<StreamTask> taskCreator,
                final StreamThread.AbstractTaskCreator<StandbyTask> standbyTaskCreator,
                final AdminClient adminClient,
                final AssignedStreamsTasks active,
                final AssignedStandbyTasks standby) {
        this.changelogReader = changelogReader;
        this.processId = processId;
        this.logPrefix = logPrefix;
        this.streamsMetadataState = streamsMetadataState;
        this.restoreConsumer = restoreConsumer;
        this.taskCreator = taskCreator;
        this.standbyTaskCreator = standbyTaskCreator;
        this.active = active;
        this.standby = standby;

        final LogContext logContext = new LogContext(logPrefix);

        this.log = logContext.logger(getClass());

        this.adminClient = adminClient;
    }
}