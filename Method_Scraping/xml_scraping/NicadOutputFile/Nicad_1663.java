public class Nicad_1663
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