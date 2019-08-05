//1023:maven/maven-core/src/main/java/org/apache/maven/RepositoryUtils.java
//None

public class Nicad_maven312
{
    public static boolean repositoriesEquals( List<RemoteRepository> r1, List<RemoteRepository> r2 )
    {
        if ( r1.size() != r2.size() )
        {
            return false;
        }
    
        for ( Iterator<RemoteRepository> it1 = r1.iterator(), it2 = r2.iterator(); it1.hasNext(); )
        {
            if ( !repositoryEquals( it1.next(), it2.next() ) )
            {
                return false;
            }
        }
    
        return true;
}