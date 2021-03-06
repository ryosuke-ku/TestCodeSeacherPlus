// clone pairs:865:100%
// 1456:maven/maven-model-builder/src/main/java/org/apache/maven/model/profile/activation/PropertyProfileActivator.java

public class Nicad_t1_maven205
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
}