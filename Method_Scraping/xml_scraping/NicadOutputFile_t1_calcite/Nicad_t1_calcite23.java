// clone pairs:998:90%
// 1718:maven/maven-compat/src/main/java/org/apache/maven/artifact/resolver/filter/OrArtifactFilter.java

public class Nicad_t1_calcite23
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