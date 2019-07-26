// clone pairs:278:100%
// 232:logging-log4j2/log4j-core/src/main/java/org/apache/logging/log4j/core/net/ssl/TrustStoreConfiguration.java

public class Nicad_t1_logging39
{
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TrustStoreConfiguration other = (TrustStoreConfiguration) obj;
        if (trustManagerFactoryAlgorithm == null) {
            if (other.trustManagerFactoryAlgorithm != null) {
                return false;
            }
        } else if (!trustManagerFactoryAlgorithm.equals(other.trustManagerFactoryAlgorithm)) {
            return false;
        }
        return true;
    }
}