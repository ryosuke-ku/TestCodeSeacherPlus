// clone pairs:1072:90%
// 1862:maven/maven-model-builder/src/main/java/org/apache/maven/model/building/FileModelSource.java

public class Nicad_t1_maven_9035
{
    public boolean equals( Object obj ) 
    {
        if ( this == obj ) 
        {
            return true;
        }
        
        if ( !( obj instanceof FileModelSource ) ) 
        {
            return false;
        }
        FileModelSource other = ( FileModelSource ) obj;
        return getFile().equals( other.getFile() );
    }
}