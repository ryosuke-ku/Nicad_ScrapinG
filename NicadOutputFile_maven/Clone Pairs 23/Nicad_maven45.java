//55:maven/maven-core/src/main/java/org/apache/maven/execution/scope/internal/MojoExecutionScope.java
//maven/maven-core/src/test/java/org/apache/maven/execution/scope/internal/MojoExecutionScopeTest.java

public class Nicad_maven45
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