//742:maven/maven-core/src/main/java/org/apache/maven/bridge/MavenRepositorySystem.java
//None

public class Nicad_maven198
{
    public static Mirror getMirror( ArtifactRepository repository, List<Mirror> mirrors )
    {
        String repoId = repository.getId();

        if ( repoId != null && mirrors != null )
        {
            for ( Mirror mirror : mirrors )
            {
                if ( repoId.equals( mirror.getMirrorOf() ) && matchesLayout( repository, mirror ) )
                {
                    return mirror;
                }
            }

            for ( Mirror mirror : mirrors )
            {
                if ( matchPattern( repository, mirror.getMirrorOf() ) && matchesLayout( repository, mirror ) )
                {
                    return mirror;
                }
            }
        }

        return null;
}