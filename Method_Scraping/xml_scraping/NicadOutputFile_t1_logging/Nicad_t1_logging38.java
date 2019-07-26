// clone pairs:277:90%
// 230:logging-log4j2/log4j-core/src/main/java/org/apache/logging/log4j/core/net/ssl/TrustStoreConfiguration.java

public class Nicad_t1_logging38
{
    public static TrustStoreConfiguration createKeyStoreConfiguration(
            // @formatter:off
            @PluginAttribute("location") final String location,
            @PluginAttribute(value = "password", sensitive = true) final char[] password,
            @PluginAttribute("passwordEnvironmentVariable") final String passwordEnvironmentVariable,
            @PluginAttribute("passwordFile") final String passwordFile,
            @PluginAttribute("type") final String keyStoreType,
            @PluginAttribute("trustManagerFactoryAlgorithm") final String trustManagerFactoryAlgorithm) throws StoreConfigurationException {
            // @formatter:on

        if (password != null && passwordEnvironmentVariable != null && passwordFile != null) {
            throw new IllegalStateException("You MUST set only one of 'password', 'passwordEnvironmentVariable' or 'passwordFile'.");
        }
        try {
            // @formatter:off
            PasswordProvider provider = passwordFile != null
                    ? new FilePasswordProvider(passwordFile)
                    : passwordEnvironmentVariable != null
                            ? new EnvironmentPasswordProvider(passwordEnvironmentVariable)
                            // the default is memory char[] array, which may be null
                            : new MemoryPasswordProvider(password);
            // @formatter:on
            if (password != null) {
                Arrays.fill(password, '\0');
            }
            return new TrustStoreConfiguration(location, provider, keyStoreType, trustManagerFactoryAlgorithm);
        } catch (Exception ex) {
            throw new StoreConfigurationException("Could not configure TrustStore", ex);
        }
    }
}