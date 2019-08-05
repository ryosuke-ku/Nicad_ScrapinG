//1022:maven/maven-core/src/main/java/org/apache/maven/project/artifact/DefaultMavenMetadataCache.java
//maven/maven-core/src/test/java/org/apache/maven/project/artifact/DefaultMavenMetadataCacheTest.java

public class Nicad_maven311
{
    private static boolean repositoriesEquals( List<ArtifactRepository> r1, List<ArtifactRepository> r2 )
    {
        if ( r1.size() != r2.size() )
        {
            return false;
        }

        for ( Iterator<ArtifactRepository> it1 = r1.iterator(), it2 = r2.iterator(); it1.hasNext(); )
        {
            if ( !repositoryEquals( it1.next(), it2.next() ) )
            {
                return false;
            }
        }

        return true;
}