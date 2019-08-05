//1850:maven/maven-core/src/main/java/org/apache/maven/plugin/DefaultPluginRealmCache.java
//None

public class Nicad_maven793
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

            CacheKey that = (CacheKey) o;

            return parentRealm == that.parentRealm 
                && CacheUtils.pluginEquals( plugin, that.plugin )
                && Objects.equals( workspace, that.workspace ) 
                && Objects.equals( localRepo, that.localRepo )
                && RepositoryUtils.repositoriesEquals( this.repositories, that.repositories ) 
                && Objects.equals( filter, that.filter )
                && Objects.equals( foreignImports, that.foreignImports );
}