// clone pairs:1212:90%
// 2124:maven/maven-core/src/main/java/org/apache/maven/artifact/resolver/filter/AndArtifactFilter.java

public class Nicad_t1_calcite66
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