//C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/maven/maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java
//C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/maven/maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java
// clone pairs:13:100%
// 19:maven/maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java

public class Nicad_t1_maven_07269
{
    private Proxy getProxy( RepositorySystemSession session, ArtifactRepository repository )
    {
        if ( session != null )
        {
            ProxySelector selector = session.getProxySelector();
            if ( selector != null )
            {
                RemoteRepository repo = RepositoryUtils.toRepo( repository );
                org.eclipse.aether.repository.Proxy proxy = selector.getProxy( repo );
                if ( proxy != null )
                {
                    Proxy p = new Proxy();
                    p.setHost( proxy.getHost() );
                    p.setProtocol( proxy.getType() );
                    p.setPort( proxy.getPort() );
                    if ( proxy.getAuthentication() != null )
                    {
                        repo = new RemoteRepository.Builder( repo ).setProxy( proxy ).build();
                        AuthenticationContext authCtx = AuthenticationContext.forProxy( session, repo );
                        p.setUserName( authCtx.get( AuthenticationContext.USERNAME ) );
                        p.setPassword( authCtx.get( AuthenticationContext.PASSWORD ) );
                        p.setNtlmDomain( authCtx.get( AuthenticationContext.NTLM_DOMAIN ) );
                        p.setNtlmHost( authCtx.get( AuthenticationContext.NTLM_WORKSTATION ) );
                        authCtx.close();
                    }
                    return p;
                }
            }
        }
        return null;
    }
}