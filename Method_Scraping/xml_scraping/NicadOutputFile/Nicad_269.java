// clone pairs:960:80%
// 1644:maven/maven-artifact/src/main/java/org/apache/maven/artifact/versioning/ComparableVersion.java

public class Nicad_269
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

            IntItem intItem = (IntItem) o;

            return value == intItem.value;

        }
}