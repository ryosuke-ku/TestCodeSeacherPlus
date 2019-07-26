//C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/maven/maven-core/src/main/java/org/apache/maven/session/scope/internal/SessionScope.java
//C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/maven/maven-core/src/main/java/org/apache/maven/execution/scope/internal/MojoExecutionScope.java
// clone pairs:33:100%
// 55:maven/maven-core/src/main/java/org/apache/maven/execution/scope/internal/MojoExecutionScope.java

public class Nicad_t1_maven_072617
{
    public <T> Provider<T> scope( final Key<T> key, final Provider<T> unscoped )
    {
        return new Provider<T>()
        {
            @SuppressWarnings( "unchecked" )
            public T get()
            {
                LinkedList<ScopeState> stack = values.get();
                if ( stack == null || stack.isEmpty() )
                {
                    throw new OutOfScopeException( "Cannot access " + key + " outside of a scoping block" );
                }

                ScopeState state = stack.getFirst();

                Provider<?> seeded = state.seeded.get( key );

                if ( seeded != null )
                {
                    return (T) seeded.get();
                }

                T provided = (T) state.provided.get( key );
                if ( provided == null && unscoped != null )
                {
                    provided = unscoped.get();
                    state.provided.put( key, provided );
                }

                return provided;
            }
        };
    }
}