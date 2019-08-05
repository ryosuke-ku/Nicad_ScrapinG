//2098:maven/maven-core/src/main/java/org/apache/maven/execution/DefaultMavenExecutionRequestPopulator.java
//maven/maven-core/src/test/java/org/apache/maven/execution/DefaultMavenExecutionRequestPopulatorTest.java

public class Nicad_maven869
{
    private void injectDefaultRepositories( MavenExecutionRequest request )
        throws MavenExecutionRequestPopulationException
    {
        Set<String> definedRepositories = repositorySystem.getRepoIds( request.getRemoteRepositories() );

        if ( !definedRepositories.contains( RepositorySystem.DEFAULT_REMOTE_REPO_ID ) )
        {
            try
            {
                request.addRemoteRepository( repositorySystem.createDefaultRemoteRepository( request ) );
            }
            catch ( Exception e )
            {
                throw new MavenExecutionRequestPopulationException( "Cannot create default remote repository.", e );
            }
        }
}