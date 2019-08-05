//1930:maven/maven-core/src/main/java/org/apache/maven/project/ReactorModelPool.java
//None

public class Nicad_maven815
{
        public boolean equals( Object obj )
        {
            if ( this == obj )
            {
                return true;
            }

            if ( !( obj instanceof CacheKey ) )
            {
                return false;
            }

            CacheKey that = (CacheKey) obj;

            return artifactId.equals( that.artifactId ) && groupId.equals( that.groupId )
                && version.equals( that.version );
}