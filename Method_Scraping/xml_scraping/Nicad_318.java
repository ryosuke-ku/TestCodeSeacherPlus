// clone pairs:1114:90%
// 1928:maven/maven-core/src/main/java/org/apache/maven/execution/scope/internal/MojoExecutionScope.java

public class Nicad_318
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