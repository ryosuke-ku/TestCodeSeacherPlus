// clone pairs:9777:91%
// 10679:flink/flink-connectors/flink-connector-kinesis/src/main/java/org/apache/flink/streaming/connectors/kinesis/util/KinesisConfigUtil.java

public class Nicad_t2_flink389
{
	private static void validateOptionalPositiveIntProperty(Properties config, String key, String message) {
		if (config.containsKey(key)) {
			try {
				int value = Integer.parseInt(config.getProperty(key));
				if (value < 0) {
					throw new NumberFormatException();
				}
			} catch (NumberFormatException e) {
				throw new IllegalArgumentException(message);
			}
		}
	}
}