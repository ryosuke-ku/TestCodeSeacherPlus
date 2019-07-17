public class Nicad_47
{
        public CacheKey( Plugin plugin, DependencyFilter extensionFilter, List<RemoteRepository> repositories,
                         RepositorySystemSession session )
        {
            this.plugin = plugin.clone();
            workspace = RepositoryUtils.getWorkspace( session );
            this.localRepo = session.getLocalRepository();
            this.repositories = new ArrayList<>( repositories.size() );
            for ( RemoteRepository repository : repositories )
            {
                if ( repository.isRepositoryManager() )
                {
                    this.repositories.addAll( repository.getMirroredRepositories() );
                }
                else
                {
                    this.repositories.add( repository );
                }
            }
            this.filter = extensionFilter;

            int hash = 17;
            hash = hash * 31 + CacheUtils.pluginHashCode( plugin );
            hash = hash * 31 + Objects.hashCode( workspace );
            hash = hash * 31 + Objects.hashCode( localRepo );
            hash = hash * 31 + RepositoryUtils.repositoriesHashCode( repositories );
            hash = hash * 31 + Objects.hashCode( extensionFilter );
            this.hashCode = hash;
        }
}