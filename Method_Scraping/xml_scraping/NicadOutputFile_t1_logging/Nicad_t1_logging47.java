// clone pairs:346:73%
// 294:logging-log4j2/log4j-core/src/main/java/org/apache/logging/log4j/core/filter/AbstractFilter.java

public class Nicad_t1_logging47
{
    protected boolean equalsImpl(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equalsImpl(obj)) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AbstractFilter other = (AbstractFilter) obj;
        if (onMatch != other.onMatch) {
            return false;
        }
        if (onMismatch != other.onMismatch) {
            return false;
        }
        return true;
    }
}