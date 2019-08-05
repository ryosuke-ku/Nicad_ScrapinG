//1:maven/maven-core/src/main/java/org/apache/maven/settings/SettingsUtils.java
//maven/maven-core/src/test/java/org/apache/maven/settings/SettingsUtilsTest.java

public class Nicad_maven1
{
    public static org.apache.maven.model.Profile convertFromSettingsProfile( Profile settingsProfile )
    {
        org.apache.maven.model.Profile profile = new org.apache.maven.model.Profile();

        profile.setId( settingsProfile.getId() );

        profile.setSource( "settings.xml" );

        Activation settingsActivation = settingsProfile.getActivation();

        if ( settingsActivation != null )
        {
            org.apache.maven.model.Activation activation = new org.apache.maven.model.Activation();

            activation.setActiveByDefault( settingsActivation.isActiveByDefault() );

            activation.setJdk( settingsActivation.getJdk() );

            ActivationProperty settingsProp = settingsActivation.getProperty();

            if ( settingsProp != null )
            {
                org.apache.maven.model.ActivationProperty prop = new org.apache.maven.model.ActivationProperty();

                prop.setName( settingsProp.getName() );
                prop.setValue( settingsProp.getValue() );

                activation.setProperty( prop );
            }

            ActivationOS settingsOs = settingsActivation.getOs();

            if ( settingsOs != null )
            {
                org.apache.maven.model.ActivationOS os = new org.apache.maven.model.ActivationOS();

                os.setArch( settingsOs.getArch() );
                os.setFamily( settingsOs.getFamily() );
                os.setName( settingsOs.getName() );
                os.setVersion( settingsOs.getVersion() );

                activation.setOs( os );
            }

            org.apache.maven.settings.ActivationFile settingsFile = settingsActivation.getFile();

            if ( settingsFile != null )
            {
                ActivationFile file = new ActivationFile();

                file.setExists( settingsFile.getExists() );
                file.setMissing( settingsFile.getMissing() );

                activation.setFile( file );
            }

            profile.setActivation( activation );
        }

        profile.setProperties( settingsProfile.getProperties() );

        List<Repository> repos = settingsProfile.getRepositories();
        if ( repos != null )
        {
            for ( Repository repo : repos )
            {
                profile.addRepository( convertFromSettingsRepository( repo ) );
            }
        }

        List<Repository> pluginRepos = settingsProfile.getPluginRepositories();
        if ( pluginRepos != null )
        {
            for ( Repository pluginRepo : pluginRepos )
            {
                profile.addPluginRepository( convertFromSettingsRepository( pluginRepo ) );
            }
        }

        return profile;
}