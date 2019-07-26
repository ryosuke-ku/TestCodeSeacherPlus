// clone pairs:382:83%
// 723:maven/maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java

public class Nicad_t1_maven_new71
{
    public ArtifactRepository buildArtifactRepository( Repository repo )
        throws InvalidRepositoryException
    {
        if ( repo != null )
        {
            String id = repo.getId();

            if ( StringUtils.isEmpty( id ) )
            {
                throw new InvalidRepositoryException( "Repository identifier missing", "" );
            }

            String url = repo.getUrl();

            if ( StringUtils.isEmpty( url ) )
            {
                throw new InvalidRepositoryException( "URL missing for repository " + id, id );
            }

            ArtifactRepositoryPolicy snapshots = buildArtifactRepositoryPolicy( repo.getSnapshots() );

            ArtifactRepositoryPolicy releases = buildArtifactRepositoryPolicy( repo.getReleases() );

            return createArtifactRepository( id, url, getLayout( repo.getLayout() ), snapshots, releases );
        }
        else
        {
            return null;
        }
    }
}