//C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/maven/maven-compat/src/main/java/org/apache/maven/profiles/ProfilesConversionUtils.java
//C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/maven/maven-core/src/main/java/org/apache/maven/settings/SettingsUtils.java
// clone pairs:485:85%
// 835:maven/maven-core/src/main/java/org/apache/maven/settings/SettingsUtils.java

public class Nicad_t1_maven_072694
{
    private static org.apache.maven.model.Repository convertFromSettingsRepository( Repository settingsRepo )
    {
        org.apache.maven.model.Repository repo = new org.apache.maven.model.Repository();

        repo.setId( settingsRepo.getId() );
        repo.setLayout( settingsRepo.getLayout() );
        repo.setName( settingsRepo.getName() );
        repo.setUrl( settingsRepo.getUrl() );

        if ( settingsRepo.getSnapshots() != null )
        {
            repo.setSnapshots( convertRepositoryPolicy( settingsRepo.getSnapshots() ) );
        }
        if ( settingsRepo.getReleases() != null )
        {
            repo.setReleases( convertRepositoryPolicy( settingsRepo.getReleases() ) );
        }

        return repo;
    }
}