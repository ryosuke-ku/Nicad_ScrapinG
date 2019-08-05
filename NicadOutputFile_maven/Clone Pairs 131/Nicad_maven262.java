//848:maven/maven-core/src/main/java/org/apache/maven/settings/SettingsUtils.java
//maven/maven-core/src/test/java/org/apache/maven/settings/SettingsUtilsTest.java

public class Nicad_maven262
{
    private static Repository convertToSettingsRepository( org.apache.maven.model.Repository modelRepo )
    {
        Repository repo = new Repository();

        repo.setId( modelRepo.getId() );
        repo.setLayout( modelRepo.getLayout() );
        repo.setName( modelRepo.getName() );
        repo.setUrl( modelRepo.getUrl() );

        if ( modelRepo.getSnapshots() != null )
        {
            repo.setSnapshots( convertRepositoryPolicy( modelRepo.getSnapshots() ) );
        }
        if ( modelRepo.getReleases() != null )
        {
            repo.setReleases( convertRepositoryPolicy( modelRepo.getReleases() ) );
        }

        return repo;
}