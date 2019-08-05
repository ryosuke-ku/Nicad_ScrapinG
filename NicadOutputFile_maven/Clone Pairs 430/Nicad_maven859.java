//2034:maven/maven-core/src/main/java/org/apache/maven/artifact/resolver/filter/CumulativeScopeArtifactFilter.java
//None

public class Nicad_maven859
{
    public boolean equals( Object obj )
    {
        if ( this == obj )
        {
            return true;
        }

        if ( !( obj instanceof CumulativeScopeArtifactFilter ) )
        {
            return false;
        }

        CumulativeScopeArtifactFilter that = (CumulativeScopeArtifactFilter) obj;

        return scopes.equals( that.scopes );
}