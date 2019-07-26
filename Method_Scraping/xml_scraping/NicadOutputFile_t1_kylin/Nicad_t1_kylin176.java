// clone pairs:1124:100%
// 1834:kylin/core-job/src/main/java/org/apache/kylin/job/engine/JobEngineConfig.java

public class Nicad_t1_kylin176
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