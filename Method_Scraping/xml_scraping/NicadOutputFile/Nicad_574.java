public class Nicad_574
{
        public int compareTo( Item item )
        {
            if ( item == null )
            {
                return BigInteger.ZERO.equals( value ) ? 0 : 1; // 1.0 == 1, 1.1 > 1
            }

            switch ( item.getType() )
            {
                case INT_ITEM:
                case LONG_ITEM:
                    return 1;

                case BIGINTEGER_ITEM:
                    return value.compareTo( ( (BigIntegerItem) item ).value );

                case STRING_ITEM:
                    return 1; // 1.1 > 1-sp

                case LIST_ITEM:
                    return 1; // 1.1 > 1-1

                default:
                    throw new IllegalStateException( "invalid item: " + item.getClass() );
            }
        }
}