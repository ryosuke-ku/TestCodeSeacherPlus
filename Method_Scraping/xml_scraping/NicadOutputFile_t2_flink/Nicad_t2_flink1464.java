// clone pairs:23381:70%
// 35001:flink/flink-runtime/src/main/java/org/apache/flink/runtime/taskexecutor/TaskExecutorToResourceManagerConnection.java

public class Nicad_t2_flink1464
{
	public TaskExecutorToResourceManagerConnection(
			Logger log,
			RpcService rpcService,
			String taskManagerAddress,
			ResourceID taskManagerResourceId,
			RetryingRegistrationConfiguration retryingRegistrationConfiguration,
			int dataPort,
			HardwareDescription hardwareDescription,
			String resourceManagerAddress,
			ResourceManagerId resourceManagerId,
			Executor executor,
			RegistrationConnectionListener<TaskExecutorToResourceManagerConnection, TaskExecutorRegistrationSuccess> registrationListener) {

		super(log, resourceManagerAddress, resourceManagerId, executor);

		this.rpcService = checkNotNull(rpcService);
		this.taskManagerAddress = checkNotNull(taskManagerAddress);
		this.taskManagerResourceId = checkNotNull(taskManagerResourceId);
		this.retryingRegistrationConfiguration = checkNotNull(retryingRegistrationConfiguration);
		this.dataPort = dataPort;
		this.hardwareDescription = checkNotNull(hardwareDescription);
		this.registrationListener = checkNotNull(registrationListener);
	}
}