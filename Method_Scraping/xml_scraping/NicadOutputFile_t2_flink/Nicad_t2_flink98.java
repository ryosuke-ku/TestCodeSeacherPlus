// clone pairs:1171:90%
// 2042:maven/maven-core/src/main/java/org/apache/maven/artifact/resolver/filter/AndArtifactFilter.java

public class Nicad_t2_flink98
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