//1955:maven/maven-core/src/main/java/org/apache/maven/project/ReactorModelCache.java
//None

public class Nicad_maven820
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
                && version.equals( that.version ) && tag.equals( that.tag );
}