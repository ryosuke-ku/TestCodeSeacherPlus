public class Nicad_2105
{
    public MavenExecutionRequest addMirror( Mirror mirror )
    {
        Objects.requireNonNull( mirror, "mirror cannot be null" );

        for ( Mirror p : getMirrors() )
        {
            if ( p.getId() != null && p.getId().equals( mirror.getId() ) )
            {
                return this;
            }
        }

        getMirrors().add( mirror );

        return this;
    }
}