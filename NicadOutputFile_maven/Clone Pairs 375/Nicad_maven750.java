//1715:maven/maven-core/src/main/java/org/apache/maven/artifact/resolver/filter/ScopeArtifactFilter.java
//None

public class Nicad_maven750
{
    public boolean equals( Object obj )
    {
        if ( this == obj )
        {
            return true;
        }

        if ( !( obj instanceof ScopeArtifactFilter ) )
        {
            return false;
        }

        ScopeArtifactFilter other = (ScopeArtifactFilter) obj;

        return equals( scope, other.scope );
}