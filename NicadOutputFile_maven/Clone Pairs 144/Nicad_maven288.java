//945:maven/maven-resolver-provider/src/main/java/org/apache/maven/repository/internal/DefaultModelResolver.java
//maven/maven-resolver-provider/src/test/java/org/apache/maven/repository/internal/DefaultModelResolverTest.java

public class Nicad_maven288
{
    private DefaultModelResolver( DefaultModelResolver original )
    {
        this.session = original.session;
        this.trace = original.trace;
        this.context = original.context;
        this.resolver = original.resolver;
        this.versionRangeResolver = original.versionRangeResolver;
        this.remoteRepositoryManager = original.remoteRepositoryManager;
        this.repositories = new ArrayList<>( original.repositories );
        this.externalRepositories = original.externalRepositories;
        this.repositoryIds = new HashSet<>( original.repositoryIds );
}