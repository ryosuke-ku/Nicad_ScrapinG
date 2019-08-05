//18:maven/maven-resolver-provider/src/main/java/org/apache/maven/repository/internal/DefaultVersionRangeResolver.java
//None

public class Nicad_maven18
{
    private Versioning readVersions( RepositorySystemSession session, RequestTrace trace, Metadata metadata,
                                     ArtifactRepository repository, VersionRangeResult result )
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