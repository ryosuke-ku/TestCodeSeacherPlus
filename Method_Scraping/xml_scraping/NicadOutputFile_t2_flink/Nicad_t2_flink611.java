// clone pairs:11320:70%
// 12800:flink/flink-core/src/main/java/org/apache/flink/configuration/ConfigOption.java

public class Nicad_t2_flink611
{
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		else if (o != null && o.getClass() == ConfigOption.class) {
			ConfigOption<?> that = (ConfigOption<?>) o;
			return this.key.equals(that.key) &&
					Arrays.equals(this.fallbackKeys, that.fallbackKeys) &&
					(this.defaultValue == null ? that.defaultValue == null :
							(that.defaultValue != null && this.defaultValue.equals(that.defaultValue)));
		}
		else {
			return false;
		}
	}
}