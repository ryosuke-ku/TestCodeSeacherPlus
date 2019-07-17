public class Nicad_741
{
    public static CoreExtensionEntry discoverFrom( ClassRealm loader, Collection<File> classpath )
    {
        Set<String> artifacts = new LinkedHashSet<>();
        Set<String> packages = new LinkedHashSet<>();

        try
        {
            for ( File entry : classpath )
            {
                ExtensionDescriptor descriptor = BUILDER.build( entry );
                if ( descriptor != null )
                {
                    artifacts.addAll( descriptor.getExportedArtifacts() );
                    packages.addAll( descriptor.getExportedPackages() );
                }
            }
        }
        catch ( IOException ignored )
        {
            // exports descriptors are entirely optional
        }

        return new CoreExtensionEntry( loader, artifacts, packages );
    }
}