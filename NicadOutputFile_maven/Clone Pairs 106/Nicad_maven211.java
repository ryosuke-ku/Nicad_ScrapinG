//785:maven/maven-core/src/main/java/org/apache/maven/project/MavenProject.java
//maven/maven-core/src/test/java/org/apache/maven/project/MavenProjectTest.java

public class Nicad_maven211
{
    public List<String> getRuntimeClasspathElements()
        throws DependencyResolutionRequiredException
    {
        List<String> list = new ArrayList<>( getArtifacts().size() + 1 );

        String d = getBuild().getOutputDirectory();
        if ( d != null )
        {
            list.add( d );
        }

        for ( Artifact a : getArtifacts() )
        {
            if ( a.getArtifactHandler().isAddedToClasspath()
            // TODO let the scope handler deal with this
                && ( Artifact.SCOPE_COMPILE.equals( a.getScope() ) || Artifact.SCOPE_RUNTIME.equals( a.getScope() ) ) )
            {
                addArtifactPath( a, list );
            }
        }
        return list;
}