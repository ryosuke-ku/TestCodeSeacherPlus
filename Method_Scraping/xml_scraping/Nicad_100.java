// clone pairs:507:71%
// 871:maven/maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java

public class Nicad_100
{
    public Artifact createPluginArtifact( Plugin plugin )
    {
        String version = plugin.getVersion();
        if ( StringUtils.isEmpty( version ) )
        {
            version = "RELEASE";
        }

        VersionRange versionRange;
        try
        {
            versionRange = VersionRange.createFromVersionSpec( version );
        }
        catch ( InvalidVersionSpecificationException e )
        {
            // MNG-5368: Log a message instead of returning 'null' silently.
            this.logger.error( String.format(
                "Invalid version specification '%s' creating plugin artifact '%s'.",
                version, plugin ), e );

            return null;
        }

        return artifactFactory.createPluginArtifact( plugin.getGroupId(), plugin.getArtifactId(), versionRange );
    }
}