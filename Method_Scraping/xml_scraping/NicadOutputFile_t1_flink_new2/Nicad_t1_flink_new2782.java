// clone pairs:11549:90%
// 13151:flink/flink-core/src/main/java/org/apache/flink/api/common/operators/ResourceSpec.java

public class Nicad_t1_flink_new2782
{
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		} else if (obj != null && obj.getClass() == ResourceSpec.class) {
			ResourceSpec that = (ResourceSpec) obj;
			return this.cpuCores == that.cpuCores &&
					this.heapMemoryInMB == that.heapMemoryInMB &&
					this.directMemoryInMB == that.directMemoryInMB &&
					this.nativeMemoryInMB == that.nativeMemoryInMB &&
					this.stateSizeInMB == that.stateSizeInMB &&
					Objects.equals(this.extendedResources, that.extendedResources);
		} else {
			return false;
		}
	}
}