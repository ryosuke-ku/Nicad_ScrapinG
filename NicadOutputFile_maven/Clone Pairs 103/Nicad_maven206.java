//766:maven/maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java
//None

public class Nicad_maven206
{
    public static ArtifactRepositoryPolicy buildArtifactRepositoryPolicy( org.apache.maven.model.RepositoryPolicy
                                                                          policy )
    {
        boolean enabled = true;

        String updatePolicy = null;

        String checksumPolicy = null;

        if ( policy != null )
        {
            enabled = policy.isEnabled();

            if ( policy.getUpdatePolicy() != null )
            {
                updatePolicy = policy.getUpdatePolicy();
            }
            if ( policy.getChecksumPolicy() != null )
            {
                checksumPolicy = policy.getChecksumPolicy();
            }
        }

        return new ArtifactRepositoryPolicy( enabled, updatePolicy, checksumPolicy );
}