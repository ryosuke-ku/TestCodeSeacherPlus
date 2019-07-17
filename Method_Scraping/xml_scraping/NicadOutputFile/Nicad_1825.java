public class Nicad_1825
{
    public boolean equals( Object obj )
    {
        if ( this == obj )
        {
            return true;
        }

        if ( !( obj instanceof CumulativeScopeArtifactFilter ) )
        {
            return false;
        }

        CumulativeScopeArtifactFilter that = (CumulativeScopeArtifactFilter) obj;

        return scopes.equals( that.scopes );
    }
}