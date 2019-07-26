// clone pairs:137:70%
// 119:logging-log4j2/log4j-core/src/main/java/org/apache/logging/log4j/core/net/ssl/TrustStoreConfiguration.java

public class Nicad_t1_logging17
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