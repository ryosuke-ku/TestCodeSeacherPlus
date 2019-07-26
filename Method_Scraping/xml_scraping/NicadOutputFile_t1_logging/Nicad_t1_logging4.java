// clone pairs:57:79%
// 28:logging-log4j2/log4j-core/src/main/java/org/apache/logging/log4j/core/filter/DynamicThresholdFilter.java

public class Nicad_t1_logging4
{
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equalsImpl(obj)) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DynamicThresholdFilter other = (DynamicThresholdFilter) obj;
        if (defaultThreshold == null) {
            if (other.defaultThreshold != null) {
                return false;
            }
        } else if (!defaultThreshold.equals(other.defaultThreshold)) {
            return false;
        }
        if (key == null) {
            if (other.key != null) {
                return false;
            }
        } else if (!key.equals(other.key)) {
            return false;
        }
        if (levelMap == null) {
            if (other.levelMap != null) {
                return false;
            }
        } else if (!levelMap.equals(other.levelMap)) {
            return false;
        }
        return true;
    }
}