public class Nicad_2051
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

            return parentRealm == that.parentRealm 
                && CacheUtils.pluginEquals( plugin, that.plugin )
                && Objects.equals( workspace, that.workspace ) 
                && Objects.equals( localRepo, that.localRepo )
                && RepositoryUtils.repositoriesEquals( this.repositories, that.repositories ) 
                && Objects.equals( filter, that.filter )
                && Objects.equals( foreignImports, that.foreignImports );
        }
}