// clone pairs:246:71%
// 209:logging-log4j2/log4j-api/src/main/java/org/apache/logging/log4j/spi/MutableThreadContextStack.java

public class Nicad_t1_logging35
{
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof ThreadContextStack)) {
            return false;
        }
        final ThreadContextStack other = (ThreadContextStack) obj;
        final List<String> otherAsList = other.asList();
        if (this.list == null) {
            if (otherAsList != null) {
                return false;
            }
        } else if (!this.list.equals(otherAsList)) {
            return false;
        }
        return true;
    }
}