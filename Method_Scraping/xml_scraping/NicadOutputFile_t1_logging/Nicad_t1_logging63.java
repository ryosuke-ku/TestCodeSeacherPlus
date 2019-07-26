// clone pairs:475:93%
// 429:logging-log4j2/log4j-api/src/main/java/org/apache/logging/log4j/util/LoaderUtil.java

public class Nicad_t1_logging63
{
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            final UrlResource that = (UrlResource) o;

            if (classLoader != null ? !classLoader.equals(that.classLoader) : that.classLoader != null) {
                return false;
            }
            if (url != null ? !url.equals(that.url) : that.url != null) {
                return false;
            }

            return true;
        }
}