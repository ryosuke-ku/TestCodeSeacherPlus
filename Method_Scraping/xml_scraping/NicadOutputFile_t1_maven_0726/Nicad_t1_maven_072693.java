//C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/maven/maven-compat/src/main/java/org/apache/maven/profiles/ProfilesConversionUtils.java
//C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/maven/maven-core/src/main/java/org/apache/maven/settings/SettingsUtils.java
// clone pairs:484:100%
// 833:maven/maven-core/src/main/java/org/apache/maven/settings/SettingsUtils.java

public class Nicad_t1_maven_072693
{
    private static Repository convertToSettingsRepository( org.apache.maven.model.Repository modelRepo )
    {
        Repository repo = new Repository();

        repo.setId( modelRepo.getId() );
        repo.setLayout( modelRepo.getLayout() );
        repo.setName( modelRepo.getName() );
        repo.setUrl( modelRepo.getUrl() );

        if ( modelRepo.getSnapshots() != null )
        {
            repo.setSnapshots( convertRepositoryPolicy( modelRepo.getSnapshots() ) );
        }
        if ( modelRepo.getReleases() != null )
        {
            repo.setReleases( convertRepositoryPolicy( modelRepo.getReleases() ) );
        }

        return repo;
    }
}