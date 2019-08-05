//1535:maven/maven-resolver-provider/src/main/java/org/apache/maven/repository/internal/DefaultModelCache.java
//None

public class Nicad_maven600
{
        public boolean equals( Object obj )
        {
            if ( this == obj )
            {
                return true;
            }
            if ( null == obj || !getClass().equals( obj.getClass() ) )
            {
                return false;
            }

            Key that = (Key) obj;
            return artifactId.equals( that.artifactId ) && groupId.equals( that.groupId )
                && version.equals( that.version ) && tag.equals( that.tag );
}