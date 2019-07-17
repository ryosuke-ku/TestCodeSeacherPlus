public class Nicad_1579
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