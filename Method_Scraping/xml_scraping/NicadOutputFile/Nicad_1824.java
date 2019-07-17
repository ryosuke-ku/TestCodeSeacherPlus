public class Nicad_1824
{
    public boolean equals( Object obj )
    {
        if ( this == obj )
        {
            return true;
        }

        if ( !( obj instanceof ExclusionSetFilter ) )
        {
            return false;
        }

        ExclusionSetFilter other = (ExclusionSetFilter) obj;

        return excludes.equals( other.excludes );
    }
}