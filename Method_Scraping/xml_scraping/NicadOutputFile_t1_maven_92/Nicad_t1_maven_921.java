// clone pairs:527:92%
// 875:maven/maven-core/src/main/java/org/apache/maven/artifact/repository/MavenArtifactRepository.java

public class Nicad_t1_maven_921
{
    public boolean equals( Object obj )
    {
        if ( this == obj )
        {
            return true;
        }
        if ( obj == null )
        {
            return false;
        }
        if ( getClass() != obj.getClass() )
        {
            return false;
        }

        ArtifactRepository other = (ArtifactRepository) obj;

        return eq( getId(), other.getId() );
    }
}