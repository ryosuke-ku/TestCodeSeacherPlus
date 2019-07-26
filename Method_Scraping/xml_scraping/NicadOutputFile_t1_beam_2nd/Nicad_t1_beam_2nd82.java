// clone pairs:1475:91%
// 1259:beam/runners/flink/src/main/java/org/apache/beam/runners/flink/FlinkJobServerDriver.java

public class Nicad_t1_beam_2nd82
{
  public static FlinkJobServerDriver fromParams(String[] args) {
    FlinkServerConfiguration configuration = new FlinkServerConfiguration();
    CmdLineParser parser = new CmdLineParser(configuration);
    try {
      parser.parseArgument(args);
    } catch (CmdLineException e) {
      LOG.error("Unable to parse command line arguments.", e);
      printUsage(parser);
      throw new IllegalArgumentException("Unable to parse command line arguments.", e);
    }

    return fromConfig(configuration);
  }
}