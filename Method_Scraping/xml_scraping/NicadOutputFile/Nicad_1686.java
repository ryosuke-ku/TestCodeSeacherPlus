public class Nicad_1686
{
    public boolean equals( Object obj )
    {
        if ( this == obj )
        {
            return true;
        }

        if ( !( obj instanceof InversionArtifactFilter ) )
        {
            return false;
        }

        InversionArtifactFilter other = (InversionArtifactFilter) obj;

        return toInvert.equals( other.toInvert );
    }
}