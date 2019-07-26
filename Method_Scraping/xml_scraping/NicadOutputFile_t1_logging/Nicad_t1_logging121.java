// clone pairs:2873:100%
// 1154:logging-log4j2/log4j-core/src/main/java/org/apache/logging/log4j/core/time/MutableInstant.java

public class Nicad_t1_logging121
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