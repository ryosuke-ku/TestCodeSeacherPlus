// clone pairs:11325:90%
// 12728:flink/flink-core/src/main/java/org/apache/flink/util/AbstractID.java

public class Nicad_t1_flink_new2667
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