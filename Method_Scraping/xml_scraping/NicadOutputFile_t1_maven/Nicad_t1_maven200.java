// clone pairs:799:72%
// 1329:maven/maven-resolver-provider/src/main/java/org/apache/maven/repository/internal/DefaultModelResolver.java

public class Nicad_t1_maven200
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