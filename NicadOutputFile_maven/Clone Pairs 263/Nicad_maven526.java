//1453:maven/maven-model-builder/src/main/java/org/apache/maven/model/profile/activation/OperatingSystemProfileActivator.java
//None

public class Nicad_maven526
{
    public boolean presentInConfig( Profile profile, ProfileActivationContext context, ModelProblemCollector problems )
    {
        Activation activation = profile.getActivation();

        if ( activation == null )
        {
            return false;
        }

        ActivationOS os = activation.getOs();

        if ( os == null )
        {
            return false;
        }
        return true;
}