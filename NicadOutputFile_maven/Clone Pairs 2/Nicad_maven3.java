//3:maven/maven-core/src/main/java/org/apache/maven/settings/SettingsUtils.java
//maven/maven-core/src/test/java/org/apache/maven/settings/SettingsUtilsTest.java

public class Nicad_maven3
{
    public static Profile convertToSettingsProfile( org.apache.maven.model.Profile modelProfile )
    {
        Profile profile = new Profile();

        profile.setId( modelProfile.getId() );

        org.apache.maven.model.Activation modelActivation = modelProfile.getActivation();

        if ( modelActivation != null )
        {
            Activation activation = new Activation();

            activation.setActiveByDefault( modelActivation.isActiveByDefault() );

            activation.setJdk( modelActivation.getJdk() );

            org.apache.maven.model.ActivationProperty modelProp = modelActivation.getProperty();

            if ( modelProp != null )
            {
                ActivationProperty prop = new ActivationProperty();
                prop.setName( modelProp.getName() );
                prop.setValue( modelProp.getValue() );
                activation.setProperty( prop );
            }

            org.apache.maven.model.ActivationOS modelOs = modelActivation.getOs();

            if ( modelOs != null )
            {
                ActivationOS os = new ActivationOS();

                os.setArch( modelOs.getArch() );
                os.setFamily( modelOs.getFamily() );
                os.setName( modelOs.getName() );
                os.setVersion( modelOs.getVersion() );

                activation.setOs( os );
            }

            ActivationFile modelFile = modelActivation.getFile();

            if ( modelFile != null )
            {
                org.apache.maven.settings.ActivationFile file = new org.apache.maven.settings.ActivationFile();

                file.setExists( modelFile.getExists() );
                file.setMissing( modelFile.getMissing() );

                activation.setFile( file );
            }

            profile.setActivation( activation );
        }

        profile.setProperties( modelProfile.getProperties() );

        List<org.apache.maven.model.Repository> repos = modelProfile.getRepositories();
        if ( repos != null )
        {
            for ( org.apache.maven.model.Repository repo : repos )
            {
                profile.addRepository( convertToSettingsRepository( repo ) );
            }
        }

        List<org.apache.maven.model.Repository> pluginRepos = modelProfile.getPluginRepositories();
        if ( pluginRepos != null )
        {
            for ( org.apache.maven.model.Repository pluginRepo : pluginRepos )
            {
                profile.addPluginRepository( convertToSettingsRepository( pluginRepo ) );
            }
        }

        return profile;
}