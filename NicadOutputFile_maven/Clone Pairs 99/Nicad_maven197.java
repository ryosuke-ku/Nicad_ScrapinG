//741:maven/maven-compat/src/main/java/org/apache/maven/repository/DefaultMirrorSelector.java
//maven/maven-compat/src/test/java/org/apache/maven/repository/DefaultMirrorSelectorTest.java

public class Nicad_maven197
{
    public Mirror getMirror( ArtifactRepository repository, List<Mirror> mirrors )
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