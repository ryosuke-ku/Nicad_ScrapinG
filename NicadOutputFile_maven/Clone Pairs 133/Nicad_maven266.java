//869:maven/maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java
//None

public class Nicad_maven266
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