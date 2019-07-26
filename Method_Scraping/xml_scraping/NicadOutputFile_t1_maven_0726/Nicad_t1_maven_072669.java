//C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/maven/maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java
//C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/maven/maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java
// clone pairs:195:100%
// 355:maven/maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java

public class Nicad_t1_maven_072669
{
    private Authentication getAuthentication( RepositorySystemSession session, ArtifactRepository repository )
    {
        if ( session != null )
        {
            AuthenticationSelector selector = session.getAuthenticationSelector();
            if ( selector != null )
            {
                RemoteRepository repo = RepositoryUtils.toRepo( repository );
                org.eclipse.aether.repository.Authentication auth = selector.getAuthentication( repo );
                if ( auth != null )
                {
                    repo = new RemoteRepository.Builder( repo ).setAuthentication( auth ).build();
                    AuthenticationContext authCtx = AuthenticationContext.forRepository( session, repo );
                    Authentication result =
                        new Authentication( authCtx.get( AuthenticationContext.USERNAME ),
                                            authCtx.get( AuthenticationContext.PASSWORD ) );
                    result.setPrivateKey( authCtx.get( AuthenticationContext.PRIVATE_KEY_PATH ) );
                    result.setPassphrase( authCtx.get( AuthenticationContext.PRIVATE_KEY_PASSPHRASE ) );
                    authCtx.close();
                    return result;
                }
            }
        }
        return null;
    }
}