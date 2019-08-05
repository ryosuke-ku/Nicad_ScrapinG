//1980:maven/maven-core/src/main/java/org/apache/maven/project/DefaultProjectRealmCache.java
//None

public class Nicad_maven823
{
        public boolean equals( Object o )
        {
            if ( o == this )
            {
                return true;
            }

            if ( !( o instanceof CacheKey ) )
            {
                return false;
            }

            CacheKey other = (CacheKey) o;

            return extensionRealms.equals( other.extensionRealms );
}