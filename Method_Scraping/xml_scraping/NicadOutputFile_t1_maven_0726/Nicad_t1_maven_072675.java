//C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/maven/maven-resolver-provider/src/main/java/org/apache/maven/repository/internal/ArtifactDescriptorUtils.java
//C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/maven/maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java
// clone pairs:432:80%
// 751:maven/maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java

public class Nicad_t1_maven_072675
{
    public ArtifactRepositoryPolicy buildArtifactRepositoryPolicy( RepositoryPolicy policy )
    {
        boolean enabled = true;

        String updatePolicy = null;

        String checksumPolicy = null;

        if ( policy != null )
        {
            enabled = policy.isEnabled();

            if ( policy.getUpdatePolicy() != null )
            {
                updatePolicy = policy.getUpdatePolicy();
            }
            if ( policy.getChecksumPolicy() != null )
            {
                checksumPolicy = policy.getChecksumPolicy();
            }
        }

        return new ArtifactRepositoryPolicy( enabled, updatePolicy, checksumPolicy );
    }
}