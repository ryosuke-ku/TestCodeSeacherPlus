public class Nicad_1768
{
    public boolean equals( Object o )
    {
        if ( this == o )
        {
            return true;
        }
        if ( o == null || getClass() != o.getClass() )
        {
            return false;
        }

        final ArtifactStatus that = (ArtifactStatus) o;

        return rank == that.rank;

    }
}