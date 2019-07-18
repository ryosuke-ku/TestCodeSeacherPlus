// clone pairs:987:70%
// 1696:maven/maven-compat/src/main/java/org/apache/maven/artifact/resolver/filter/OrArtifactFilter.java

public class Nicad_280
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