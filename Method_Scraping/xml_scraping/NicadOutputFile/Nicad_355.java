public class Nicad_355
{
        public int compareTo( Item item )
        {
            if ( item == null )
            {
                // 1-rc < 1, 1-ga > 1
                return comparableQualifier( value ).compareTo( RELEASE_VERSION_INDEX );
            }
            switch ( item.getType() )
            {
                case INT_ITEM:
                case LONG_ITEM:
                case BIGINTEGER_ITEM:
                    return -1; // 1.any < 1.1 ?

                case STRING_ITEM:
                    return comparableQualifier( value ).compareTo( comparableQualifier( ( (StringItem) item ).value ) );

                case LIST_ITEM:
                    return -1; // 1.any < 1-1

                default:
                    throw new IllegalStateException( "invalid item: " + item.getClass() );
            }
        }
}