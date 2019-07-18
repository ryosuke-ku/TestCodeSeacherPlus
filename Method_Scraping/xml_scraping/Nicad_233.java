// clone pairs:910:80%
// 1545:maven/maven-artifact/src/main/java/org/apache/maven/artifact/versioning/ComparableVersion.java

public class Nicad_233
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