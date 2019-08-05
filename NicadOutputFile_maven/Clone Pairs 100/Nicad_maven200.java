//744:maven/maven-compat/src/main/java/org/apache/maven/project/ModelUtils.java
//maven/maven-compat/src/test/java/org/apache/maven/project/ModelUtilsTest.java

public class Nicad_maven200
{
    private static List<Dependency> mergeDependencyList( List<Dependency> child, List<Dependency> parent )
    {
        Map<String, Dependency> depsMap = new LinkedHashMap<>();

        if ( parent != null )
        {
            for ( Dependency dependency : parent )
            {
                depsMap.put( dependency.getManagementKey(), dependency );
            }
        }

        if ( child != null )
        {
            for ( Dependency dependency : child )
            {
                depsMap.put( dependency.getManagementKey(), dependency );
            }
        }

        return new ArrayList<>( depsMap.values() );
}