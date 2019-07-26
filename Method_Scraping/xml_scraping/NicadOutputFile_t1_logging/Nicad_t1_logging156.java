// clone pairs:3107:90%
// 1534:logging-log4j2/log4j-core/src/main/java/org/apache/logging/log4j/core/impl/JdkMapAdapterStringMap.java

public class Nicad_t1_logging156
{
    public boolean equals(final Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof JdkMapAdapterStringMap)) {
            return false;
        }
        final JdkMapAdapterStringMap other = (JdkMapAdapterStringMap) object;
        return map.equals(other.map) && immutable == other.immutable;
    }
}