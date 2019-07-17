public class Nicad_2080
{
        public boolean equals( Object o )
        {
            if ( o == this )
            {
                return true;
            }

            if ( !( o instanceof CacheKey ) )
            {
                return false;
            }

            CacheKey that = (CacheKey) o;

            return CacheUtils.pluginEquals( plugin, that.plugin ) 
                && Objects.equals( workspace, that.workspace )
                && Objects.equals( localRepo, that.localRepo ) 
                && RepositoryUtils.repositoriesEquals( repositories, that.repositories )
                && Objects.equals( filter, that.filter );
        }
}