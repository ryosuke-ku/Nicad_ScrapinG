//786:maven/maven-core/src/main/java/org/apache/maven/project/MavenProject.java
//maven/maven-core/src/test/java/org/apache/maven/project/MavenProjectTest.java

public class Nicad_maven212
{
    public List<String> getSystemClasspathElements()
        throws DependencyResolutionRequiredException
    {
        List<String> list = new ArrayList<>( getArtifacts().size() );

        String d = getBuild().getOutputDirectory();
        if ( d != null )
        {
            list.add( d );
        }

        for ( Artifact a : getArtifacts() )
        {
            if ( a.getArtifactHandler().isAddedToClasspath() )
            {
                // TODO let the scope handler deal with this
                if ( Artifact.SCOPE_SYSTEM.equals( a.getScope() ) )
                {
                    addArtifactPath( a, list );
                }
            }
        }
        return list;
}