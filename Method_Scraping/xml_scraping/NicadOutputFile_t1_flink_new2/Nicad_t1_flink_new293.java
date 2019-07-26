// clone pairs:6511:75%
// 6583:flink/flink-mesos/src/main/java/org/apache/flink/mesos/runtime/clusterframework/MesosTaskManagerParameters.java

public class Nicad_t1_flink_new293
{
	public MesosTaskManagerParameters(
			double cpus,
			int gpus,
			int disk,
			ContainerType containerType,
			Option<String> containerImageName,
			ContaineredTaskManagerParameters containeredParameters,
			List<Protos.Volume> containerVolumes,
			List<Protos.Parameter> dockerParameters,
			boolean dockerForcePullImage,
			List<ConstraintEvaluator> constraints,
			String command,
			Option<String> bootstrapCommand,
			Option<String> taskManagerHostname,
			List<String> uris) {

		this.cpus = cpus;
		this.gpus = gpus;
		this.disk = disk;
		this.containerType = Preconditions.checkNotNull(containerType);
		this.containerImageName = Preconditions.checkNotNull(containerImageName);
		this.containeredParameters = Preconditions.checkNotNull(containeredParameters);
		this.containerVolumes = Preconditions.checkNotNull(containerVolumes);
		this.dockerParameters = Preconditions.checkNotNull(dockerParameters);
		this.dockerForcePullImage = dockerForcePullImage;
		this.constraints = Preconditions.checkNotNull(constraints);
		this.command = Preconditions.checkNotNull(command);
		this.bootstrapCommand = Preconditions.checkNotNull(bootstrapCommand);
		this.taskManagerHostname = Preconditions.checkNotNull(taskManagerHostname);
		this.uris = Preconditions.checkNotNull(uris);
	}
}