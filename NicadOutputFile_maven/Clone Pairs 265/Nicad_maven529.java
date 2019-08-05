//1456:maven/maven-model-builder/src/main/java/org/apache/maven/model/profile/activation/PropertyProfileActivator.java
//maven/maven-model-builder/src/test/java/org/apache/maven/model/profile/activation/PropertyProfileActivatorTest.java

public class Nicad_maven529
{
    public boolean presentInConfig( Profile profile, ProfileActivationContext context, ModelProblemCollector problems )
    {
        Activation activation = profile.getActivation();

        if ( activation == null )
        {
            return false;
        }

        ActivationProperty property = activation.getProperty();

        if ( property == null )
        {
            return false;
        }
        return true;
}