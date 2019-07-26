//C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/maven/maven-compat/src/main/java/org/apache/maven/project/inheritance/DefaultModelInheritanceAssembler.java
//C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/maven/maven-compat/src/main/java/org/apache/maven/project/ModelUtils.java
// clone pairs:35:86%
// 60:maven/maven-compat/src/main/java/org/apache/maven/project/ModelUtils.java

public class Nicad_t1_maven_072618
{
    private static void mergePluginExecutionDefinitions( PluginExecution child, PluginExecution parent )
    {
        if ( child.getPhase() == null )
        {
            child.setPhase( parent.getPhase() );
        }

        List<String> parentGoals = parent.getGoals();
        List<String> childGoals = child.getGoals();

        List<String> goals = new ArrayList<>();

        if ( ( childGoals != null ) && !childGoals.isEmpty() )
        {
            goals.addAll( childGoals );
        }

        if ( parentGoals != null )
        {
            for (  String goal : parentGoals )
            {
                if ( !goals.contains( goal ) )
                {
                    goals.add( goal );
                }
            }
        }

        child.setGoals( goals );

        Xpp3Dom childConfiguration = (Xpp3Dom) child.getConfiguration();
        Xpp3Dom parentConfiguration = (Xpp3Dom) parent.getConfiguration();

        childConfiguration = Xpp3Dom.mergeXpp3Dom( childConfiguration, parentConfiguration );

        child.setConfiguration( childConfiguration );
    }
}