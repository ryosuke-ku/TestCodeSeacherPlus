//C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/maven/maven-compat/src/main/java/org/apache/maven/artifact/ArtifactStatus.java
//C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/maven/maven-artifact/src/main/java/org/apache/maven/artifact/versioning/ComparableVersion.java
// clone pairs:907:80%
// 1533:maven/maven-artifact/src/main/java/org/apache/maven/artifact/versioning/ComparableVersion.java

public class Nicad_t1_maven_0726227
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