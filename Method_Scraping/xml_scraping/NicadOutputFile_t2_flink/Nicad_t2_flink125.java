// clone pairs:5455:78%
// 5860:flink/flink-libraries/flink-gelly-examples/src/main/java/org/apache/flink/graph/drivers/parameter/DoubleParameter.java

public class Nicad_t2_flink125
{
	public DoubleParameter setMinimumValue(double minimumValue, boolean inclusive) {
		if (hasDefaultValue) {
			if (inclusive) {
				Util.checkParameter(minimumValue <= defaultValue,
					"Minimum value (" + minimumValue + ") must be less than or equal to default (" + defaultValue + ")");
			} else {
				Util.checkParameter(minimumValue < defaultValue,
					"Minimum value (" + minimumValue + ") must be less than default (" + defaultValue + ")");
			}
		} else if (hasMaximumValue) {
			if (inclusive && maximumValueInclusive) {
				Util.checkParameter(minimumValue <= maximumValue,
					"Minimum value (" + minimumValue + ") must be less than or equal to maximum (" + maximumValue + ")");
			} else {
				Util.checkParameter(minimumValue < maximumValue,
					"Minimum value (" + minimumValue + ") must be less than maximum (" + maximumValue + ")");
			}
		}

		this.hasMinimumValue = true;
		this.minimumValue = minimumValue;
		this.minimumValueInclusive = inclusive;

		return this;
	}
}