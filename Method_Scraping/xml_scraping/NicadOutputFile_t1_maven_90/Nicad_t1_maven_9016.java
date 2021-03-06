// clone pairs:866:100%
// 1464:maven/maven-model-builder/src/main/java/org/apache/maven/model/profile/activation/JdkVersionProfileActivator.java

public class Nicad_t1_maven_9016
{
    public boolean presentInConfig( Profile profile, ProfileActivationContext context, ModelProblemCollector problems )
    {
        Activation activation = profile.getActivation();

        if ( activation == null )
        {
            return false;
        }

        String jdk = activation.getJdk();

        if ( jdk == null )
        {
            return false;
        }
        return true;
    }
}