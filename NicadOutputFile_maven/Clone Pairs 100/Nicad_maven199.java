//743:maven/maven-compat/src/main/java/org/apache/maven/project/inheritance/DefaultModelInheritanceAssembler.java
//None

public class Nicad_maven199
{
    private void assembleDependencyInheritance( Model child, Model parent )
    {
        Map<String, Dependency> depsMap = new LinkedHashMap<>();

        List<Dependency> deps = parent.getDependencies();

        if ( deps != null )
        {
            for ( Dependency dependency : deps )
            {
                depsMap.put( dependency.getManagementKey(), dependency );
            }
        }

        deps = child.getDependencies();

        if ( deps != null )
        {
            for ( Dependency dependency : deps )
            {
                depsMap.put( dependency.getManagementKey(), dependency );
            }
        }

        child.setDependencies( new ArrayList<>( depsMap.values() ) );
}