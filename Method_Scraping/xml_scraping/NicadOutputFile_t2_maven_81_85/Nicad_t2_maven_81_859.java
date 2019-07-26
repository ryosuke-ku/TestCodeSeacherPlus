// clone pairs:577:83%
// 948:maven/maven-core/src/main/java/org/apache/maven/project/ProjectModelResolver.java

public class Nicad_t2_maven_81_859
{
    private ProjectModelResolver( ProjectModelResolver original )
    {
        this.session = original.session;
        this.trace = original.trace;
        this.resolver = original.resolver;
        this.remoteRepositoryManager = original.remoteRepositoryManager;
        this.pomRepositories = new ArrayList<>( original.pomRepositories );
        this.externalRepositories = original.externalRepositories;
        this.repositories = new ArrayList<>( original.repositories );
        this.repositoryMerging = original.repositoryMerging;
        this.repositoryIds = new HashSet<>( original.repositoryIds );
        this.modelPool = original.modelPool;
    }
}