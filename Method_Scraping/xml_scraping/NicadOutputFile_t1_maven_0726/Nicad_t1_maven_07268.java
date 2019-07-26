//C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/maven/maven-resolver-provider/src/main/java/org/apache/maven/repository/internal/DefaultVersionRangeResolver.java
//C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/maven/maven-resolver-provider/src/main/java/org/apache/maven/repository/internal/DefaultVersionResolver.java
// clone pairs:9:70%
// 17:maven/maven-resolver-provider/src/main/java/org/apache/maven/repository/internal/DefaultVersionResolver.java

public class Nicad_t1_maven_07268
{
    private Versioning readVersions( RepositorySystemSession session, RequestTrace trace, Metadata metadata,
                                     ArtifactRepository repository, VersionResult result )
    {
        Versioning versioning = null;
        try
        {
            if ( metadata != null )
            {
                try ( SyncContext syncContext = syncContextFactory.newInstance( session, true ) )
                {
                    syncContext.acquire( null, Collections.singleton( metadata ) );

                    if ( metadata.getFile() != null && metadata.getFile().exists() )
                    {
                        try ( final InputStream in = new FileInputStream( metadata.getFile() ) )
                        {
                            versioning = new MetadataXpp3Reader().read( in, false ).getVersioning();

                            /*
                            NOTE: Users occasionally misuse the id "local" for remote repos which screws up the metadata
                            of the local repository. This is especially troublesome during snapshot resolution so we try
                            to handle that gracefully.
                             */
                            if ( versioning != null && repository instanceof LocalRepository
                                     && versioning.getSnapshot() != null
                                     && versioning.getSnapshot().getBuildNumber() > 0 )
                            {
                                final Versioning repaired = new Versioning();
                                repaired.setLastUpdated( versioning.getLastUpdated() );
                                repaired.setSnapshot( new Snapshot() );
                                repaired.getSnapshot().setLocalCopy( true );
                                versioning = repaired;
                                throw new IOException( "Snapshot information corrupted with remote repository data"
                                                           + ", please verify that no remote repository uses the id '"
                                                           + repository.getId() + "'" );

                            }
                        }
                    }
                }
            }
        }
        catch ( Exception e )
        {
            invalidMetadata( session, trace, metadata, repository, e );
            result.addException( e );
        }

        return ( versioning != null ) ? versioning : new Versioning();
    }
}