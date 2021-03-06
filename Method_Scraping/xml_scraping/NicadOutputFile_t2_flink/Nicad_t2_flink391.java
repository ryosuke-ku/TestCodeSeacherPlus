// clone pairs:9779:91%
// 10683:flink/flink-connectors/flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/util/KinesisConfigUtil.java

public class Nicad_t2_flink391
{
	private static void validateOptionalPositiveLongProperty(Properties config, String key, String message) {
		if (config.containsKey(key)) {
			try {
				long value = Long.parseLong(config.getProperty(key));
				if (value < 0) {
					throw new NumberFormatException();
				}
			} catch (NumberFormatException e) {
				throw new IllegalArgumentException(message);
			}
		}
	}
}