public class Nicad_2015
{
    public boolean equals( Object obj )
    {
        if ( this == obj )
        {
            return true;
        }

        if ( !( obj instanceof ScopeArtifactFilter ) )
        {
            return false;
        }

        ScopeArtifactFilter other = (ScopeArtifactFilter) obj;

        return equals( scope, other.scope );
    }
}