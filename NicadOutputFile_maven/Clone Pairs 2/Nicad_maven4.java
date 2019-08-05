//4:maven/maven-compat/src/main/java/org/apache/maven/profiles/ProfilesConversionUtils.java
//None

public class Nicad_maven4
{
    public static Profile convertFromProfileXmlProfile( org.apache.maven.profiles.Profile profileXmlProfile )
    {
        Profile profile = new Profile();

        profile.setId( profileXmlProfile.getId() );

        profile.setSource( "profiles.xml" );

        org.apache.maven.profiles.Activation profileActivation = profileXmlProfile.getActivation();

        if ( profileActivation != null )
        {
            Activation activation = new Activation();

            activation.setActiveByDefault( profileActivation.isActiveByDefault() );

            activation.setJdk( profileActivation.getJdk() );

            org.apache.maven.profiles.ActivationProperty profileProp = profileActivation.getProperty();

            if ( profileProp != null )
            {
                ActivationProperty prop = new ActivationProperty();

                prop.setName( profileProp.getName() );
                prop.setValue( profileProp.getValue() );

                activation.setProperty( prop );
            }


            ActivationOS profileOs = profileActivation.getOs();

            if ( profileOs != null )
            {
                org.apache.maven.model.ActivationOS os = new org.apache.maven.model.ActivationOS();

                os.setArch( profileOs.getArch() );
                os.setFamily( profileOs.getFamily() );
                os.setName( profileOs.getName() );
                os.setVersion( profileOs.getVersion() );

                activation.setOs( os );
            }

            org.apache.maven.profiles.ActivationFile profileFile = profileActivation.getFile();

            if ( profileFile != null )
            {
                ActivationFile file = new ActivationFile();

                file.setExists( profileFile.getExists() );
                file.setMissing( profileFile.getMissing() );

                activation.setFile( file );
            }

            profile.setActivation( activation );
        }

        profile.setProperties( profileXmlProfile.getProperties() );

        List repos = profileXmlProfile.getRepositories();
        if ( repos != null )
        {
            for ( Object repo : repos )
            {
                profile.addRepository( convertFromProfileXmlRepository( (org.apache.maven.profiles.Repository) repo ) );
            }
        }

        List pluginRepos = profileXmlProfile.getPluginRepositories();
        if ( pluginRepos != null )
        {
            for ( Object pluginRepo : pluginRepos )
            {
                profile.addPluginRepository(
                    convertFromProfileXmlRepository( (org.apache.maven.profiles.Repository) pluginRepo ) );
            }
        }

        return profile;
}