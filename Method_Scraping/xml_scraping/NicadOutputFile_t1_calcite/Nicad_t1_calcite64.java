// clone pairs:1193:90%
// 2087:maven/maven-core/src/main/java/org/apache/maven/artifact/resolver/filter/AndArtifactFilter.java

public class Nicad_t1_calcite64
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