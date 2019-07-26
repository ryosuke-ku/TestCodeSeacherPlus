// clone pairs:945:80%
// 1614:maven/maven-artifact/src/main/java/org/apache/maven/artifact/ArtifactUtils.java

public class Nicad_t2_maven_76_8020
{
    private static <T> List<T> copyList( List<T> original )
    {
        List<T> copy = null;

        if ( original != null )
        {
            copy = new ArrayList<>();

            if ( !original.isEmpty() )
            {
                copy.addAll( original );
            }
        }

        return copy;
    }
}