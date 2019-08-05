//836:maven/maven-compat/src/main/java/org/apache/maven/profiles/ProfilesConversionUtils.java
//None

public class Nicad_maven260
{
    private static Repository convertFromProfileXmlRepository( org.apache.maven.profiles.Repository profileXmlRepo )
    {
        Repository repo = new Repository();

        repo.setId( profileXmlRepo.getId() );
        repo.setLayout( profileXmlRepo.getLayout() );
        repo.setName( profileXmlRepo.getName() );
        repo.setUrl( profileXmlRepo.getUrl() );

        if ( profileXmlRepo.getSnapshots() != null )
        {
            repo.setSnapshots( convertRepositoryPolicy( profileXmlRepo.getSnapshots() ) );
        }
        if ( profileXmlRepo.getReleases() != null )
        {
            repo.setReleases( convertRepositoryPolicy( profileXmlRepo.getReleases() ) );
        }

        return repo;
}