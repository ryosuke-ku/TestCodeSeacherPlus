// clone pairs:985:100%
// 1693:maven/maven-core/src/main/java/org/apache/maven/artifact/resolver/filter/AndArtifactFilter.java

public class Nicad_278
{
    public boolean equals( Object obj )
    {
        if ( this == obj )
        {
            return true;
        }

        if ( !( obj instanceof AndArtifactFilter ) )
        {
            return false;
        }

        AndArtifactFilter other = (AndArtifactFilter) obj;

        return filters.equals( other.filters );
    }
}