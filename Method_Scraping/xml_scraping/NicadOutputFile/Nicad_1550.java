public class Nicad_1550
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

            return Objects.equals( groupId, that.groupId ) && Objects.equals( artifactId, that.artifactId )
                && Objects.equals( version, that.version )
                && Objects.equals( dependencyArtifacts, that.dependencyArtifacts )
                && Objects.equals( workspace, that.workspace ) 
                && Objects.equals( localRepo, that.localRepo )
                && RepositoryUtils.repositoriesEquals( repositories, that.repositories )
                && Objects.equals( collect, that.collect ) 
                && Objects.equals( resolve, that.resolve )
                && aggregating == that.aggregating;
        }
}