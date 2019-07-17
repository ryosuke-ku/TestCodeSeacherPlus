public class Nicad_1832
{
    private boolean isValidIdWithWildCards( String id )
    {
        for ( int i = 0; i < id.length(); i++ )
        {
            char c = id.charAt( i );
            if ( !isValidIdWithWildCardCharacter( c ) )
            {
                return false;
            }
        }
        return true;
    }
}