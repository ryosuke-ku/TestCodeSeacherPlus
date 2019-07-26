//C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/maven/maven-core/src/main/java/org/apache/maven/project/artifact/ActiveProjectArtifact.java
//C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/maven/maven-artifact/src/main/java/org/apache/maven/artifact/DefaultArtifact.java
// clone pairs:154:76%
// 294:maven/maven-artifact/src/main/java/org/apache/maven/artifact/DefaultArtifact.java

public class Nicad_t1_maven_072667
{
    public boolean equals( Object o )
    {
        if ( o == this )
        {
            return true;
        }

        if ( !( o instanceof Artifact ) )
        {
            return false;
        }

        Artifact a = (Artifact) o;

        if ( !a.getGroupId().equals( groupId ) )
        {
            return false;
        }
        else if ( !a.getArtifactId().equals( artifactId ) )
        {
            return false;
        }
        else if ( !a.getVersion().equals( version ) )
        {
            return false;
        }
        else if ( !a.getType().equals( type ) )
        {
            return false;
        }
        else if ( a.getClassifier() == null ? classifier != null : !a.getClassifier().equals( classifier ) )
        {
            return false;
        }

        // We don't consider the version range in the comparison, just the resolved version

        return true;
    }
}