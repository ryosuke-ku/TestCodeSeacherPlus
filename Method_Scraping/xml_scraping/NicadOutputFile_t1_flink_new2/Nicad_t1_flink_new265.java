// clone pairs:5840:83%
// 6184:flink/flink-container/src/main/java/org/apache/flink/container/entrypoint/StandaloneJobClusterEntryPoint.java

public class Nicad_t1_flink_new265
{
	public static void main(String[] args) {
		// startup checks and logging
		EnvironmentInformation.logEnvironmentInfo(LOG, StandaloneJobClusterEntryPoint.class.getSimpleName(), args);
		SignalHandler.register(LOG);
		JvmShutdownSafeguard.installAsShutdownHook(LOG);

		final CommandLineParser<StandaloneJobClusterConfiguration> commandLineParser = new CommandLineParser<>(new StandaloneJobClusterConfigurationParserFactory());
		StandaloneJobClusterConfiguration clusterConfiguration = null;

		try {
			clusterConfiguration = commandLineParser.parse(args);
		} catch (Exception e) {
			LOG.error("Could not parse command line arguments {}.", args, e);
			commandLineParser.printHelp(StandaloneJobClusterEntryPoint.class.getSimpleName());
			System.exit(1);
		}

		Configuration configuration = loadConfiguration(clusterConfiguration);
		setDefaultExecutionModeIfNotConfigured(configuration);

		StandaloneJobClusterEntryPoint entrypoint = new StandaloneJobClusterEntryPoint(
			configuration,
			clusterConfiguration.getJobId(),
			clusterConfiguration.getSavepointRestoreSettings(),
			clusterConfiguration.getArgs(),
			clusterConfiguration.getJobClassName());

		ClusterEntrypoint.runClusterEntrypoint(entrypoint);
	}
}