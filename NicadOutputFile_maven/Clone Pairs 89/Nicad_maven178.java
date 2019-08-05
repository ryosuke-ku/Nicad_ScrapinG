//708:maven/maven-resolver-provider/src/main/java/org/apache/maven/repository/internal/DefaultModelResolver.java
//maven/maven-resolver-provider/src/test/java/org/apache/maven/repository/internal/DefaultModelResolverTest.java

public class Nicad_maven178
{
    public ModelSource resolveModel( final Dependency dependency )
        throws UnresolvableModelException
    {
        try
        {
            final Artifact artifact = new DefaultArtifact( dependency.getGroupId(), dependency.getArtifactId(), "",
                                                           "pom", dependency.getVersion() );

            final VersionRangeRequest versionRangeRequest = new VersionRangeRequest( artifact, repositories, context );
            versionRangeRequest.setTrace( trace );

            final VersionRangeResult versionRangeResult =
                versionRangeResolver.resolveVersionRange( session, versionRangeRequest );

            if ( versionRangeResult.getHighestVersion() == null )
            {
                throw new UnresolvableModelException(
                    String.format( "No versions matched the requested dependency version range '%s'",
                                   dependency.getVersion() ),
                    dependency.getGroupId(), dependency.getArtifactId(), dependency.getVersion() );

            }

            if ( versionRangeResult.getVersionConstraint() != null
                     && versionRangeResult.getVersionConstraint().getRange() != null
                     && versionRangeResult.getVersionConstraint().getRange().getUpperBound() == null )
            {
                // Message below is checked for in the MNG-4463 core IT.
                throw new UnresolvableModelException(
                    String.format( "The requested dependency version range '%s' does not specify an upper bound",
                                   dependency.getVersion() ),
                    dependency.getGroupId(), dependency.getArtifactId(), dependency.getVersion() );

            }

            dependency.setVersion( versionRangeResult.getHighestVersion().toString() );

            return resolveModel( dependency.getGroupId(), dependency.getArtifactId(), dependency.getVersion() );
        }
        catch ( VersionRangeResolutionException e )
        {
            throw new UnresolvableModelException( e.getMessage(), dependency.getGroupId(), dependency.getArtifactId(),
                                                  dependency.getVersion(), e );

        }
}