//724:maven/maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java
//None

public class Nicad_maven190
{
    public static ArtifactRepository buildArtifactRepository( org.apache.maven.model.Repository repo )
        throws InvalidRepositoryException
    {
        if ( repo != null )
        {
            String id = repo.getId();

            if ( StringUtils.isEmpty( id ) )
            {
                throw new InvalidRepositoryException( "Repository identifier missing", "" );
            }

            String url = repo.getUrl();

            if ( StringUtils.isEmpty( url ) )
            {
                throw new InvalidRepositoryException( "URL missing for repository " + id, id );
            }

            ArtifactRepositoryPolicy snapshots = buildArtifactRepositoryPolicy( repo.getSnapshots() );

            ArtifactRepositoryPolicy releases = buildArtifactRepositoryPolicy( repo.getReleases() );

            ArtifactRepositoryLayout layout = new DefaultRepositoryLayout();

            return createArtifactRepository( id, url, layout, snapshots, releases );
        }
        else
        {
            return null;
        }
}