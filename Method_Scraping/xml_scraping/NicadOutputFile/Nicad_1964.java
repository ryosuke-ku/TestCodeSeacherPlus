public class Nicad_1964
{
        public boolean equals( Object obj )
        {
            if ( this == obj )
            {
                return true;
            }

            if ( !( obj instanceof CacheKey ) )
            {
                return false;
            }

            CacheKey that = (CacheKey) obj;

            return eq( this.artifactId, that.artifactId ) && eq( this.groupId, that.groupId )
                && eq( this.version, that.version ) && eq( this.localRepo, that.localRepo )
                && eq( this.workspace, that.workspace )
                && RepositoryUtils.repositoriesEquals( this.repositories, that.repositories );
        }
}