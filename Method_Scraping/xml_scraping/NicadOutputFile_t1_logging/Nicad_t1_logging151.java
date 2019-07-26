// clone pairs:2976:80%
// 1271:logging-log4j2/log4j-core/src/main/java/org/apache/logging/log4j/core/time/MutableInstant.java

public class Nicad_t1_logging151
{
    public boolean equals(final Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof MutableInstant)) {
            return false;
        }
        MutableInstant other = (MutableInstant) object;
        return epochSecond == other.epochSecond && nanoOfSecond == other.nanoOfSecond;
    }
}