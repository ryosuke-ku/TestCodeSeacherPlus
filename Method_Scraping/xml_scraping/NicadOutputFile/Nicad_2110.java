public class Nicad_2110
{
    public MavenExecutionRequest addProfile( Profile profile )
    {
        Objects.requireNonNull( profile, "profile cannot be null" );

        for ( Profile p : getProfiles() )
        {
            if ( p.getId() != null && p.getId().equals( profile.getId() ) )
            {
                return this;
            }
        }

        getProfiles().add( profile );

        return this;
    }
}