// clone pairs:228:81%
// 204:logging-log4j2/log4j-slf4j-impl/src/main/java/org/apache/logging/slf4j/Log4jMarker.java

public class Nicad_t1_logging34
{
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Log4jMarker)) {
			return false;
		}
		final Log4jMarker other = (Log4jMarker) obj;
		if (marker == null) {
			if (other.marker != null) {
				return false;
			}
		} else if (!marker.equals(other.marker)) {
			return false;
		}
		return true;
	}
}