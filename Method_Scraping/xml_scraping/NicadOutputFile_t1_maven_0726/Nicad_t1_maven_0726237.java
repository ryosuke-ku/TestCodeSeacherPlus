//C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/maven/maven-core/src/main/java/org/apache/maven/artifact/resolver/filter/IncludesArtifactFilter.java
//C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/maven/maven-artifact/src/main/java/org/apache/maven/artifact/versioning/ComparableVersion.java
// clone pairs:920:100%
// 1559:maven/maven-artifact/src/main/java/org/apache/maven/artifact/versioning/ComparableVersion.java

public class Nicad_t1_maven_0726237
{
        public boolean equals( Object o )
        {
            if ( this == o )
            {
                return true;
            }
            if ( o == null || getClass() != o.getClass() )
            {
                return false;
            }

            BigIntegerItem that = (BigIntegerItem) o;

            return value.equals( that.value );

        }
}