//C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/maven/maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java
//C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/maven/maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java
// clone pairs:812:100%
// 1354:maven/maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java

public class Nicad_t1_maven_0726202
{
    private void injectMirror( ArtifactRepository repository, Mirror mirror )
    {
        if ( mirror != null )
        {
            ArtifactRepository original =
                createArtifactRepository( repository.getId(), repository.getUrl(), repository.getLayout(),
                                          repository.getSnapshots(), repository.getReleases() );

            repository.setMirroredRepositories( Collections.singletonList( original ) );

            repository.setId( mirror.getId() );
            repository.setUrl( mirror.getUrl() );

            if ( StringUtils.isNotEmpty( mirror.getLayout() ) )
            {
                repository.setLayout( getLayout( mirror.getLayout() ) );
            }
        }
    }
}