//C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/maven/maven-artifact/src/main/java/org/apache/maven/artifact/resolver/AbstractArtifactResolutionException.java
//C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/maven/maven-resolver-provider/src/main/java/org/apache/maven/repository/internal/DefaultModelResolver.java
// clone pairs:799:72%
// 1329:maven/maven-resolver-provider/src/main/java/org/apache/maven/repository/internal/DefaultModelResolver.java

public class Nicad_t1_maven_0726199
{
    DefaultModelResolver( RepositorySystemSession session, RequestTrace trace, String context,
                          ArtifactResolver resolver, VersionRangeResolver versionRangeResolver,
                          RemoteRepositoryManager remoteRepositoryManager, List<RemoteRepository> repositories )
    {
        this.session = session;
        this.trace = trace;
        this.context = context;
        this.resolver = resolver;
        this.versionRangeResolver = versionRangeResolver;
        this.remoteRepositoryManager = remoteRepositoryManager;
        this.repositories = repositories;
        this.externalRepositories = Collections.unmodifiableList( new ArrayList<>( repositories ) );

        this.repositoryIds = new HashSet<>();
    }
}