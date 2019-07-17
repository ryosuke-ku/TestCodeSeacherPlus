public class Nicad_46
{
        public CacheKey( Plugin plugin, ClassLoader parentRealm, Map<String, ClassLoader> foreignImports,
                         DependencyFilter dependencyFilter, List<RemoteRepository> repositories,
                         RepositorySystemSession session )
        {
            this.plugin = plugin.clone();
            this.workspace = RepositoryUtils.getWorkspace( session );
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
            this.parentRealm = parentRealm;
            this.foreignImports =
                ( foreignImports != null ) ? foreignImports : Collections.<String, ClassLoader>emptyMap();
            this.filter = dependencyFilter;

            int hash = 17;
            hash = hash * 31 + CacheUtils.pluginHashCode( plugin );
            hash = hash * 31 + Objects.hashCode( workspace );
            hash = hash * 31 + Objects.hashCode( localRepo );
            hash = hash * 31 + RepositoryUtils.repositoriesHashCode( repositories );
            hash = hash * 31 + Objects.hashCode( parentRealm );
            hash = hash * 31 + this.foreignImports.hashCode();
            hash = hash * 31 + Objects.hashCode( dependencyFilter );
            this.hashCode = hash;
        }
}