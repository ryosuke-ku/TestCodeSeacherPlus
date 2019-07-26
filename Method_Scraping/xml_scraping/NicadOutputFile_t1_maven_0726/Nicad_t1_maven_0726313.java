//C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/maven/maven-core/src/main/java/org/apache/maven/session/scope/internal/SessionScope.java
//C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/maven/maven-core/src/main/java/org/apache/maven/execution/scope/internal/MojoExecutionScope.java
// clone pairs:1114:90%
// 1922:maven/maven-core/src/main/java/org/apache/maven/execution/scope/internal/MojoExecutionScope.java

public class Nicad_t1_maven_0726313
{
    public void exit()
        throws MojoExecutionException
    {
        final LinkedList<ScopeState> stack = values.get();
        if ( stack == null || stack.isEmpty() )
        {
            throw new IllegalStateException();
        }
        stack.removeFirst();
        if ( stack.isEmpty() )
        {
            values.remove();
        }
    }
}