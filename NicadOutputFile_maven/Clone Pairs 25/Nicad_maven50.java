//62:maven/maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java
//None

public class Nicad_maven50
{
    public Artifact createDependencyArtifact( Dependency d )
    {
        if ( d.getVersion() == null )
        {
            return null;
        }

        VersionRange versionRange;
        try
        {
            versionRange = VersionRange.createFromVersionSpec( d.getVersion() );
        }
        catch ( InvalidVersionSpecificationException e )
        {
            return null;
        }

        Artifact artifact =
            createDependencyArtifactX( d.getGroupId(), d.getArtifactId(), versionRange, d.getType(),
                                                      d.getClassifier(), d.getScope(), d.isOptional() );

        if ( Artifact.SCOPE_SYSTEM.equals( d.getScope() ) && d.getSystemPath() != null )
        {
            artifact.setFile( new File( d.getSystemPath() ) );
        }

        if ( !d.getExclusions().isEmpty() )
        {
            List<String> exclusions = new ArrayList<>();

            for ( Exclusion exclusion : d.getExclusions() )
            {
                exclusions.add( exclusion.getGroupId() + ':' + exclusion.getArtifactId() );
            }

            artifact.setDependencyFilter( new ExcludesArtifactFilter( exclusions ) );
        }

        return artifact;
}