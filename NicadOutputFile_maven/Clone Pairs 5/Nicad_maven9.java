//9:maven/maven-compat/src/main/java/org/apache/maven/repository/legacy/LegacyRepositorySystem.java
//maven/maven-compat/src/test/java/org/apache/maven/repository/legacy/LegacyRepositorySystemTest.java

public class Nicad_maven9
{
    public List<ArtifactRepository> getEffectiveRepositories( List<ArtifactRepository> repositories )
    {
        if ( repositories == null )
        {
            return null;
        }

        Map<String, List<ArtifactRepository>> reposByKey = new LinkedHashMap<>();

        for ( ArtifactRepository repository : repositories )
        {
            String key = repository.getId();

            List<ArtifactRepository> aliasedRepos = reposByKey.get( key );

            if ( aliasedRepos == null )
            {
                aliasedRepos = new ArrayList<>();
                reposByKey.put( key, aliasedRepos );
            }

            aliasedRepos.add( repository );
        }

        List<ArtifactRepository> effectiveRepositories = new ArrayList<>();

        for ( List<ArtifactRepository> aliasedRepos : reposByKey.values() )
        {
            List<ArtifactRepository> mirroredRepos = new ArrayList<>();

            List<ArtifactRepositoryPolicy> releasePolicies =
                new ArrayList<>( aliasedRepos.size() );

            for ( ArtifactRepository aliasedRepo : aliasedRepos )
            {
                releasePolicies.add( aliasedRepo.getReleases() );
                mirroredRepos.addAll( aliasedRepo.getMirroredRepositories() );
            }

            ArtifactRepositoryPolicy releasePolicy = getEffectivePolicy( releasePolicies );

            List<ArtifactRepositoryPolicy> snapshotPolicies =
                new ArrayList<>( aliasedRepos.size() );

            for ( ArtifactRepository aliasedRepo : aliasedRepos )
            {
                snapshotPolicies.add( aliasedRepo.getSnapshots() );
            }

            ArtifactRepositoryPolicy snapshotPolicy = getEffectivePolicy( snapshotPolicies );

            ArtifactRepository aliasedRepo = aliasedRepos.get( 0 );

            ArtifactRepository effectiveRepository =
                createArtifactRepository( aliasedRepo.getId(), aliasedRepo.getUrl(), aliasedRepo.getLayout(),
                                          snapshotPolicy, releasePolicy );

            effectiveRepository.setAuthentication( aliasedRepo.getAuthentication() );

            effectiveRepository.setProxy( aliasedRepo.getProxy() );

            effectiveRepository.setMirroredRepositories( mirroredRepos );

            effectiveRepositories.add( effectiveRepository );
        }

        return effectiveRepositories;
}