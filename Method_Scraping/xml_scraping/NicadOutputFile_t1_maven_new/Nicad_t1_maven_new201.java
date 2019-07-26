// clone pairs:800:100%
// 1330:maven/maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java

public class Nicad_t1_maven_new201
{
    private ArtifactRepositoryPolicy getEffectivePolicy( Collection<ArtifactRepositoryPolicy> policies )
    {
        ArtifactRepositoryPolicy effectivePolicy = null;

        for ( ArtifactRepositoryPolicy policy : policies )
        {
            if ( effectivePolicy == null )
            {
                effectivePolicy = new ArtifactRepositoryPolicy( policy );
            }
            else
            {
                effectivePolicy.merge( policy );
            }
        }

        return effectivePolicy;
    }
}