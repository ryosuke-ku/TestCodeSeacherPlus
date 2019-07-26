// clone pairs:1139:90%
// 1978:maven/maven-core/src/main/java/org/apache/maven/artifact/resolver/filter/AndArtifactFilter.java

public class Nicad_t1_maven_9045
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