//746:maven/maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java
//None

public class Nicad_maven202
{
    private Mirror getMirror( RepositorySystemSession session, ArtifactRepository repository )
    {
        if ( session != null )
        {
            org.eclipse.aether.repository.MirrorSelector selector = session.getMirrorSelector();
            if ( selector != null )
            {
                RemoteRepository repo = selector.getMirror( RepositoryUtils.toRepo( repository ) );
                if ( repo != null )
                {
                    Mirror mirror = new Mirror();
                    mirror.setId( repo.getId() );
                    mirror.setUrl( repo.getUrl() );
                    mirror.setLayout( repo.getContentType() );
                    return mirror;
                }
            }
        }
        return null;
}