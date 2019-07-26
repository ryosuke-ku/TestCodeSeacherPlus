// clone pairs:2939:80%
// 1244:logging-log4j2/log4j-core/src/main/java/org/apache/logging/log4j/core/impl/JdkMapAdapterStringMap.java

public class Nicad_t1_logging144
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