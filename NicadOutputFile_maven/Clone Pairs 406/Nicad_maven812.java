//1923:maven/maven-core/src/main/java/org/apache/maven/session/scope/internal/SessionScope.java
//None

public class Nicad_maven812
{
    public void exit()
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