//C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/maven/maven-core/src/main/java/org/apache/maven/lifecycle/mapping/Lifecycle.java
//C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/maven/maven-core/src/main/java/org/apache/maven/lifecycle/mapping/LifecyclePhase.java
// clone pairs:504:85%
// 863:maven/maven-core/src/main/java/org/apache/maven/lifecycle/mapping/LifecyclePhase.java

public class Nicad_t1_maven_072695
{
    public static Map<String, String> toLegacyMap( Map<String, LifecyclePhase> lifecyclePhases )
    {
        if ( lifecyclePhases == null )
        {
            return null;
        }
        
        if ( lifecyclePhases.isEmpty() )
        {
            return Collections.emptyMap();
        }
        
        Map<String, String> phases = new LinkedHashMap<>();
        for ( Map.Entry<String, LifecyclePhase> e: lifecyclePhases.entrySet() )
        {
            phases.put( e.getKey(), e.getValue().toString() );
        }
        return phases;
    }
}