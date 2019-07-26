// clone pairs:11565:100%
// 13270:flink/flink-core/src/main/java/org/apache/flink/api/common/operators/ResourceSpec.java

public class Nicad_t2_flink699
{
	public int hashCode() {
		final long cpuBits =  Double.doubleToLongBits(cpuCores);
		int result = (int) (cpuBits ^ (cpuBits >>> 32));
		result = 31 * result + heapMemoryInMB;
		result = 31 * result + directMemoryInMB;
		result = 31 * result + nativeMemoryInMB;
		result = 31 * result + stateSizeInMB;
		result = 31 * result + extendedResources.hashCode();
		return result;
	}
}