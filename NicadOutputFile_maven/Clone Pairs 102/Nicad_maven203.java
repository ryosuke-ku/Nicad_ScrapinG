//751:maven/maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java
//maven/maven-compat/src/test/java/org/apache/maven/repository/legacy/LegacyRepositorySystemTest.java

public class Nicad_maven203
{
    public ArtifactRepositoryPolicy buildArtifactRepositoryPolicy( RepositoryPolicy policy )
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