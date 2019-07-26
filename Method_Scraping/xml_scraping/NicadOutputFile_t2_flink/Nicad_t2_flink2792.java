// clone pairs:27967:70%
// 44025:flink/flink-runtime/src/main/java/org/apache/flink/runtime/clusterframework/overlays/Krb5ConfOverlay.java

public class Nicad_t2_flink2792
{
		public Builder fromEnvironment(Configuration globalConfiguration) {

			// check the system property
			String krb5Config = System.getProperty(JAVA_SECURITY_KRB5_CONF);
			if(krb5Config != null && krb5Config.length() != 0) {
				krb5ConfPath = new File(krb5Config);
				if(!krb5ConfPath.exists()) {
					throw new IllegalStateException("java.security.krb5.conf refers to a non-existent file");
				}
			}

			// FUTURE: check the well-known paths
			// - $JAVA_HOME/lib/security
			// - %WINDIR%\krb5.ini (Windows)
			// - /etc/krb5.conf (Linux)

			return this;
		}
}