//1922:maven/maven-core/src/main/java/org/apache/maven/execution/scope/internal/MojoExecutionScope.java
//maven/maven-core/src/test/java/org/apache/maven/execution/scope/internal/MojoExecutionScopeTest.java

public class Nicad_maven811
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