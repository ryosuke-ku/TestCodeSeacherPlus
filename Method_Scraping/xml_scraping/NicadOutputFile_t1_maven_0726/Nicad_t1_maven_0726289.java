//C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/maven/maven-core/src/main/java/org/apache/maven/artifact/resolver/filter/ExclusionSetFilter.java
//C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/maven/maven-compat/src/main/java/org/apache/maven/artifact/resolver/filter/OrArtifactFilter.java
// clone pairs:1001:100%
// 1718:maven/maven-compat/src/main/java/org/apache/maven/artifact/resolver/filter/OrArtifactFilter.java

public class Nicad_t1_maven_0726289
{
    public boolean equals( Object obj )
    {
        if ( this == obj )
        {
            return true;
        }

        if ( !( obj instanceof OrArtifactFilter ) )
        {
            return false;
        }

        OrArtifactFilter other = (OrArtifactFilter) obj;

        return filters.equals( other.filters );
    }
}