// clone pairs:11329:80%
// 12736:flink/flink-core/src/main/java/org/apache/flink/util/AbstractID.java

public class Nicad_t1_flink_new2669
{
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		} else if (obj != null && obj.getClass() == getClass()) {
			AbstractID that = (AbstractID) obj;
			return that.lowerPart == this.lowerPart && that.upperPart == this.upperPart;
		} else {
			return false;
		}
	}
}