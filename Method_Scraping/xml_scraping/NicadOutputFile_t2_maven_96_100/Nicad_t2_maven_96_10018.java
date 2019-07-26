// clone pairs:1202:100%
// 2104:maven/maven-core/src/main/java/org/apache/maven/execution/DefaultMavenExecutionRequestPopulator.java

public class Nicad_t2_maven_96_10018
{
    private void injectDefaultRepositories( MavenExecutionRequest request )
        throws MavenExecutionRequestPopulationException
    {
        Set<String> definedRepositories = repositorySystem.getRepoIds( request.getRemoteRepositories() );

        if ( !definedRepositories.contains( RepositorySystem.DEFAULT_REMOTE_REPO_ID ) )
        {
            try
            {
                request.addRemoteRepository( repositorySystem.createDefaultRemoteRepository( request ) );
            }
            catch ( Exception e )
            {
                throw new MavenExecutionRequestPopulationException( "Cannot create default remote repository.", e );
            }
        }
    }
}