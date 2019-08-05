//1555:maven/maven-core/src/main/java/org/apache/maven/plugin/DefaultExtensionRealmCache.java
//None

public class Nicad_maven620
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

            return ids.equals( other.ids ) && files.equals( other.files ) && timestamps.equals( other.timestamps )
                && sizes.equals( other.sizes );
}