// clone pairs:393:70%
// 733:maven/maven-core/src/main/java/org/apache/maven/project/MavenProject.java

public class Nicad_t2_maven28
{
    public List<String> getTestClasspathElements()
        throws DependencyResolutionRequiredException
    {
        List<String> list = new ArrayList<>( getArtifacts().size() + 2 );

        String d = getBuild().getTestOutputDirectory();
        if ( d != null )
        {
            list.add( d );
        }

        d = getBuild().getOutputDirectory();
        if ( d != null )
        {
            list.add( d );
        }

        for ( Artifact a : getArtifacts() )
        {
            if ( a.getArtifactHandler().isAddedToClasspath() )
            {
                addArtifactPath( a, list );
            }
        }

        return list;
    }
}