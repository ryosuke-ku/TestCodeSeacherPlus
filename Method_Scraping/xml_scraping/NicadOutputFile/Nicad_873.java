public class Nicad_873
{
    public Artifact createPluginArtifact( Plugin plugin )
    {
        VersionRange versionRange;
        try
        {
            String version = plugin.getVersion();
            if ( StringUtils.isEmpty( version ) )
            {
                version = "RELEASE";
            }
            versionRange = VersionRange.createFromVersionSpec( version );
        }
        catch ( InvalidVersionSpecificationException e )
        {
            return null;
        }

        return createPluginArtifactX( plugin.getGroupId(), plugin.getArtifactId(), versionRange );
    }
}