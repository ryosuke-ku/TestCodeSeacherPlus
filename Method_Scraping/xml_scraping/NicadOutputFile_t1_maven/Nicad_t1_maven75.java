// clone pairs:423:100%
// 745:maven/maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java

public class Nicad_t1_maven75
{
    private Mirror getMirror( RepositorySystemSession session, ArtifactRepository repository )
    {
        if ( session != null )
        {
            org.eclipse.aether.repository.MirrorSelector selector = session.getMirrorSelector();
            if ( selector != null )
            {
                RemoteRepository repo = selector.getMirror( RepositoryUtils.toRepo( repository ) );
                if ( repo != null )
                {
                    Mirror mirror = new Mirror();
                    mirror.setId( repo.getId() );
                    mirror.setUrl( repo.getUrl() );
                    mirror.setLayout( repo.getContentType() );
                    return mirror;
                }
            }
        }
        return null;
    }
}