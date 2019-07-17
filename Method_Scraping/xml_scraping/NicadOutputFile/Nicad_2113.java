public class Nicad_2113
{
    public MavenExecutionRequest addProxy( Proxy proxy )
    {
        Objects.requireNonNull( proxy, "proxy cannot be null" );

        for ( Proxy p : getProxies() )
        {
            if ( p.getId() != null && p.getId().equals( proxy.getId() ) )
            {
                return this;
            }
        }

        getProxies().add( proxy );

        return this;
    }
}