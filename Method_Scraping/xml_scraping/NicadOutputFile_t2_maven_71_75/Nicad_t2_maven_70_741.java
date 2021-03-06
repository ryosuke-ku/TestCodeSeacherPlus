// clone pairs:183:75%
// 353:maven/maven-artifact/src/main/java/org/apache/maven/artifact/versioning/ComparableVersion.java

public class Nicad_t2_maven_70_741
{
        public int compareTo( Item item )
        {
            if ( item == null )
            {
                return ( value == 0 ) ? 0 : 1; // 1.0 == 1, 1.1 > 1
            }

            switch ( item.getType() )
            {
                case INT_ITEM:
                    return 1;
                case LONG_ITEM:
                    long itemValue = ( (LongItem) item ).value;
                    return ( value < itemValue ) ? -1 : ( ( value == itemValue ) ? 0 : 1 );
                case BIGINTEGER_ITEM:
                    return -1;

                case STRING_ITEM:
                    return 1; // 1.1 > 1-sp

                case LIST_ITEM:
                    return 1; // 1.1 > 1-1

                default:
                    throw new IllegalStateException( "invalid item: " + item.getClass() );
            }
        }
}