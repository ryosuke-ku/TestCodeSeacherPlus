public class Nicad_1831
{
    private boolean isValidId( String id )
    {
        for ( int i = 0; i < id.length(); i++ )
        {
            char c = id.charAt( i );
            if ( !isValidIdCharacter( c ) )
            {
                return false;
            }
        }
        return true;
    }
}