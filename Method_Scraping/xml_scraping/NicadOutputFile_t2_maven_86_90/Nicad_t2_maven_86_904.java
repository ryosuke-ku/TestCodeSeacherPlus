// clone pairs:451:86%
// 783:maven/maven-core/src/main/java/org/apache/maven/project/MavenProject.java

public class Nicad_t2_maven_86_904
{
    public List<String> getCompileClasspathElements()
        throws DependencyResolutionRequiredException
    {
        List<String> list = new ArrayList<>( getArtifacts().size() + 1 );

        String d = getBuild().getOutputDirectory();
        if ( d != null )
        {
            list.add( d );
        }

        for ( Artifact a : getArtifacts() )
        {
            if ( a.getArtifactHandler().isAddedToClasspath() )
            {
                // TODO let the scope handler deal with this
                if ( Artifact.SCOPE_COMPILE.equals( a.getScope() ) || Artifact.SCOPE_PROVIDED.equals( a.getScope() )
                    || Artifact.SCOPE_SYSTEM.equals( a.getScope() ) )
                {
                    addArtifactPath( a, list );
                }
            }
        }

        return list;
    }
}