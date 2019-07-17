public class Nicad_2107
{
    public MavenExecutionRequest addServer( Server server )
    {
        Objects.requireNonNull( server, "server cannot be null" );

        for ( Server p : getServers() )
        {
            if ( p.getId() != null && p.getId().equals( server.getId() ) )
            {
                return this;
            }
        }

        getServers().add( server );

        return this;
    }
}