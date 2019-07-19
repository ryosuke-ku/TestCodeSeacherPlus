// clone pairs:178:90%
// 343:maven/maven-core/src/main/java/org/apache/maven/project/MavenProject.java

public class Nicad_t2_maven11
{
    public List<Dependency> getTestDependencies()
    {
        Set<Artifact> artifacts = getArtifacts();

        if ( ( artifacts == null ) || artifacts.isEmpty() )
        {
            return Collections.emptyList();
        }

        List<Dependency> list = new ArrayList<>( artifacts.size() );

        for ( Artifact a : getArtifacts() )
        {
            Dependency dependency = new Dependency();

            dependency.setArtifactId( a.getArtifactId() );
            dependency.setGroupId( a.getGroupId() );
            dependency.setVersion( a.getVersion() );
            dependency.setScope( a.getScope() );
            dependency.setType( a.getType() );
            dependency.setClassifier( a.getClassifier() );

            list.add( dependency );
        }
        return Collections.unmodifiableList( list );
    }
}