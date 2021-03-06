// clone pairs:19:84%
// 29:maven/maven-compat/src/main/java/org/apache/maven/artifact/manager/DefaultWagonManager.java

public class Nicad_t2_maven_81_852
{
    public AuthenticationInfo getAuthenticationInfo( String id )
    {
        MavenSession session = legacySupport.getSession();

        if ( session != null && id != null )
        {
            MavenExecutionRequest request = session.getRequest();

            if ( request != null )
            {
                List<Server> servers = request.getServers();

                if ( servers != null )
                {
                    for ( Server server : servers )
                    {
                        if ( id.equalsIgnoreCase( server.getId() ) )
                        {
                            SettingsDecryptionResult result =
                                settingsDecrypter.decrypt( new DefaultSettingsDecryptionRequest( server ) );
                            server = result.getServer();

                            AuthenticationInfo authInfo = new AuthenticationInfo();
                            authInfo.setUserName( server.getUsername() );
                            authInfo.setPassword( server.getPassword() );
                            authInfo.setPrivateKey( server.getPrivateKey() );
                            authInfo.setPassphrase( server.getPassphrase() );

                            return authInfo;
                        }
                    }
                }
            }
        }

        // empty one to prevent NPE
       return new AuthenticationInfo();
    }
}