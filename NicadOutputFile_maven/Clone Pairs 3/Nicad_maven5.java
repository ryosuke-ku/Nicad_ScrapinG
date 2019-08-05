//5:maven/maven-embedder/src/main/java/org/apache/maven/cli/configuration/SettingsXmlConfigurationProcessor.java
//None

public class Nicad_maven5
{
    private MavenExecutionRequest populateFromSettings( MavenExecutionRequest request, Settings settings )
        throws MavenExecutionRequestPopulationException
    {
        if ( settings == null )
        {
            return request;
        }

        request.setOffline( settings.isOffline() );

        request.setInteractiveMode( settings.isInteractiveMode() );

        request.setPluginGroups( settings.getPluginGroups() );

        request.setLocalRepositoryPath( settings.getLocalRepository() );

        for ( Server server : settings.getServers() )
        {
            server = server.clone();

            request.addServer( server );
        }

        //  <proxies>
        //    <proxy>
        //      <active>true</active>
        //      <protocol>http</protocol>
        //      <host>proxy.somewhere.com</host>
        //      <port>8080</port>
        //      <username>proxyuser</username>
        //      <password>somepassword</password>
        //      <nonProxyHosts>www.google.com|*.somewhere.com</nonProxyHosts>
        //    </proxy>
        //  </proxies>

        for ( Proxy proxy : settings.getProxies() )
        {
            if ( !proxy.isActive() )
            {
                continue;
            }

            proxy = proxy.clone();

            request.addProxy( proxy );
        }

        // <mirrors>
        //   <mirror>
        //     <id>nexus</id>
        //     <mirrorOf>*</mirrorOf>
        //     <url>http://repository.sonatype.org/content/groups/public</url>
        //   </mirror>
        // </mirrors>

        for ( Mirror mirror : settings.getMirrors() )
        {
            mirror = mirror.clone();

            request.addMirror( mirror );
        }

        request.setActiveProfiles( settings.getActiveProfiles() );

        for ( org.apache.maven.settings.Profile rawProfile : settings.getProfiles() )
        {
            request.addProfile( SettingsUtils.convertFromSettingsProfile( rawProfile ) );

            if ( settings.getActiveProfiles().contains( rawProfile.getId() ) )
            {
                List<Repository> remoteRepositories = rawProfile.getRepositories();
                for ( Repository remoteRepository : remoteRepositories )
                {
                    try
                    {
                        request.addRemoteRepository( 
                            MavenRepositorySystem.buildArtifactRepository( remoteRepository ) );
                    }
                    catch ( InvalidRepositoryException e )
                    {
                        // do nothing for now
                    }
                }
                
                List<Repository> pluginRepositories = rawProfile.getPluginRepositories();
                for ( Repository pluginRepository : pluginRepositories )
                {
                    try
                    {
                        request.addPluginArtifactRepository( 
                            MavenRepositorySystem.buildArtifactRepository( pluginRepository ) );
                    }
                    catch ( InvalidRepositoryException e )
                    {
                        // do nothing for now
                    }
                }                
            }
        }
        return request;
}