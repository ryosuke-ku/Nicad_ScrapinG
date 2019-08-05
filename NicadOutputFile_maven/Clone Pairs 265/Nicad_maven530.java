//1457:maven/maven-model-builder/src/main/java/org/apache/maven/model/profile/activation/FileProfileActivator.java
//None

public class Nicad_maven530
{
    public boolean presentInConfig( Profile profile, ProfileActivationContext context, ModelProblemCollector problems )
    {
        Activation activation = profile.getActivation();

        if ( activation == null )
        {
            return false;
        }

        ActivationFile file = activation.getFile();

        if ( file == null )
        {
            return false;
        }
        return true;
}