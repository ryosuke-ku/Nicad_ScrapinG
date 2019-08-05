//1354:maven/maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java
//maven/maven-compat/src/test/java/org/apache/maven/repository/legacy/LegacyRepositorySystemTest.java

public class Nicad_maven521
{
    private void injectMirror( ArtifactRepository repository, Mirror mirror )
    {
        if ( mirror != null )
        {
            ArtifactRepository original =
                createArtifactRepository( repository.getId(), repository.getUrl(), repository.getLayout(),
                                          repository.getSnapshots(), repository.getReleases() );

            repository.setMirroredRepositories( Collections.singletonList( original ) );

            repository.setId( mirror.getId() );
            repository.setUrl( mirror.getUrl() );

            if ( StringUtils.isNotEmpty( mirror.getLayout() ) )
            {
                repository.setLayout( getLayout( mirror.getLayout() ) );
            }
        }
}