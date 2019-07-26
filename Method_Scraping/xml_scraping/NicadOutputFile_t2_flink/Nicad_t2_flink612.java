// clone pairs:11323:70%
// 12805:flink/flink-streaming-java/src/main/java/org/apache/flink/streaming/runtime/streamrecord/StreamRecord.java

public class Nicad_t2_flink612
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