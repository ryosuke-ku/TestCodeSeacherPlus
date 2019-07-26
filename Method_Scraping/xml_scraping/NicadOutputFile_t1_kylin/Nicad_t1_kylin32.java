// clone pairs:297:81%
// 460:kylin/stream-coordinator/src/main/java/org/apache/kylin/stream/coordinator/assign/CubePartitionRoundRobinAssigner.java

public class Nicad_t1_kylin32
{
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            CubePartition other = (CubePartition) obj;
            if (cubeName == null) {
                if (other.cubeName != null)
                    return false;
            } else if (!cubeName.equals(other.cubeName))
                return false;
            if (partition == null) {
                if (other.partition != null)
                    return false;
            } else if (!partition.equals(other.partition))
                return false;
            return true;
        }
}