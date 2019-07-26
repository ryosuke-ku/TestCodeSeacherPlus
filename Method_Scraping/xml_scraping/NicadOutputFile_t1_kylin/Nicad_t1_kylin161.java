// clone pairs:977:90%
// 1563:kylin/core-job/src/main/java/org/apache/kylin/job/engine/JobEngineConfig.java

public class Nicad_t1_kylin161
{
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        JobEngineConfig other = (JobEngineConfig) obj;
        if (config == null) {
            if (other.config != null)
                return false;
        } else if (!config.equals(other.config))
            return false;
        return true;
    }
}