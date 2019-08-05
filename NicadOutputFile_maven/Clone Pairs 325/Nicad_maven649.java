//1584:maven/maven-core/src/main/java/org/apache/maven/project/DefaultProjectRealmCache.java
//None

public class Nicad_maven649
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