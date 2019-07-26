// clone pairs:624:76%
// 1008:kylin/stream-source-kafka/src/main/java/org/apache/kylin/stream/source/kafka/KafkaTopicAssignment.java

public class Nicad_t1_kylin103
{
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        KafkaTopicAssignment other = (KafkaTopicAssignment) obj;
        if (assignments == null) {
            if (other.assignments != null)
                return false;
        } else if (!assignments.equals(other.assignments))
            return false;
        if (replicaSetID == null) {
            if (other.replicaSetID != null)
                return false;
        } else if (!replicaSetID.equals(other.replicaSetID))
            return false;
        return true;
    }
}