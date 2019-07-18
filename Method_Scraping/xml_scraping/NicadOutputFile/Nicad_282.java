// clone pairs:990:90%
// 1703:maven/maven-compat/src/main/java/org/apache/maven/artifact/resolver/filter/OrArtifactFilter.java

public class Nicad_282
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