// clone pairs:913:80%
// 1550:maven/maven-artifact/src/main/java/org/apache/maven/artifact/versioning/ComparableVersion.java

public class Nicad_t2_maven74
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