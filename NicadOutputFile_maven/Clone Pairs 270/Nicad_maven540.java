//1469:maven/maven-core/src/main/java/org/apache/maven/project/MavenProject.java
//maven/maven-core/src/test/java/org/apache/maven/project/MavenProjectTest.java

public class Nicad_maven540
{
    public List<Artifact> getSystemArtifacts()
    {
        List<Artifact> list = new ArrayList<>( getArtifacts().size() );

        for ( Artifact a : getArtifacts() )
        {
            // TODO classpath check doesn't belong here - that's the other method
            if ( a.getArtifactHandler().isAddedToClasspath() )
            {
                // TODO let the scope handler deal with this
                if ( Artifact.SCOPE_SYSTEM.equals( a.getScope() ) )
                {
                    list.add( a );
                }
            }
        }
        return list;
}