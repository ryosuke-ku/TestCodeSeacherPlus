//C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/maven/maven-model-builder/src/main/java/org/apache/maven/model/profile/activation/OperatingSystemProfileActivator.java
//C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/maven/maven-model-builder/src/main/java/org/apache/maven/model/profile/activation/PropertyProfileActivator.java
// clone pairs:863:100%
// 1452:maven/maven-model-builder/src/main/java/org/apache/maven/model/profile/activation/PropertyProfileActivator.java

public class Nicad_t1_maven_0726203
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