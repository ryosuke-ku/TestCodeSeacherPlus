// clone pairs:20906:70%
// 30219:flink/flink-streaming-java/src/main/java/org/apache/flink/streaming/runtime/streamrecord/StreamRecord.java

public class Nicad_t1_flink_new24350
{
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		else if (o != null && getClass() == o.getClass()) {
			StreamRecord<?> that = (StreamRecord<?>) o;
			return this.hasTimestamp == that.hasTimestamp &&
					(!this.hasTimestamp || this.timestamp == that.timestamp) &&
					(this.value == null ? that.value == null : this.value.equals(that.value));
		}
		else {
			return false;
		}
	}
}