// clone pairs:1075:90%
// 1868:maven/maven-model-builder/src/main/java/org/apache/maven/model/building/FileModelSource.java

public class Nicad_316
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