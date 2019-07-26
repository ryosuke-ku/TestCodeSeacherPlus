// clone pairs:176:95%
// 339:maven/maven-core/src/main/java/org/apache/maven/project/MavenProject.java

public class Nicad_t2_maven_91_951
{
    public List<Dependency> getRuntimeDependencies()
    {
        Set<Artifact> artifacts = getArtifacts();

        if ( ( artifacts == null ) || artifacts.isEmpty() )
        {
            return Collections.emptyList();
        }

        List<Dependency> list = new ArrayList<>( artifacts.size() );

        for ( Artifact a : getArtifacts() )
        {
            // TODO let the scope handler deal with this
            if ( Artifact.SCOPE_COMPILE.equals( a.getScope() ) || Artifact.SCOPE_RUNTIME.equals( a.getScope() ) )
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
        }
        return Collections.unmodifiableList( list );
    }
}