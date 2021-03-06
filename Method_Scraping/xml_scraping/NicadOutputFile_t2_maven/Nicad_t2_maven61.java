// clone pairs:875:90%
// 1474:maven/maven-core/src/main/java/org/apache/maven/project/MavenProject.java

public class Nicad_t2_maven61
{
    public List<Artifact> getCompileArtifacts()
    {
        List<Artifact> list = new ArrayList<>( getArtifacts().size() );

        for ( Artifact a : getArtifacts() )
        {
            // TODO classpath check doesn't belong here - that's the other method
            if ( a.getArtifactHandler().isAddedToClasspath() )
            {
                // TODO let the scope handler deal with this
                if ( Artifact.SCOPE_COMPILE.equals( a.getScope() ) || Artifact.SCOPE_PROVIDED.equals( a.getScope() )
                    || Artifact.SCOPE_SYSTEM.equals( a.getScope() ) )
                {
                    list.add( a );
                }
            }
        }
        return list;
    }
}