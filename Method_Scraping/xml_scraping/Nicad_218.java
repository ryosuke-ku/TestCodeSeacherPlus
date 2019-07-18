// clone pairs:888:80%
// 1501:maven/maven-artifact/src/main/java/org/apache/maven/artifact/versioning/ComparableVersion.java

public class Nicad_218
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

            LongItem longItem = (LongItem) o;

            return value == longItem.value;

        }
}