// clone pairs:1001:100%
// 1724:maven/maven-compat/src/main/java/org/apache/maven/artifact/resolver/filter/OrArtifactFilter.java

public class Nicad_291
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