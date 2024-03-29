//752:maven/maven-resolver-provider/src/main/java/org/apache/maven/repository/internal/ArtifactDescriptorUtils.java
//None

public class Nicad_maven204
{
    public static RepositoryPolicy toRepositoryPolicy( org.apache.maven.model.RepositoryPolicy policy )
    {
        boolean enabled = true;
        String checksums = RepositoryPolicy.CHECKSUM_POLICY_WARN;
        String updates = RepositoryPolicy.UPDATE_POLICY_DAILY;

        if ( policy != null )
        {
            enabled = policy.isEnabled();
            if ( policy.getUpdatePolicy() != null )
            {
                updates = policy.getUpdatePolicy();
            }
            if ( policy.getChecksumPolicy() != null )
            {
                checksums = policy.getChecksumPolicy();
            }
        }

        return new RepositoryPolicy( enabled, updates, checksums );
}