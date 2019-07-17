public class Nicad_1762
{
    public boolean equals( Object obj )
    {
        if ( this == obj )
        {
            return true;
        }

        if ( !( obj instanceof TypeArtifactFilter ) )
        {
            return false;
        }

        TypeArtifactFilter other = (TypeArtifactFilter) obj;

        return type.equals( other.type );
    }
}