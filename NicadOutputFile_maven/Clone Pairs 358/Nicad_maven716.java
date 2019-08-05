//1651:maven/maven-compat/src/main/java/org/apache/maven/artifact/resolver/filter/InversionArtifactFilter.java
//None

public class Nicad_maven716
{
    public boolean equals( Object obj )
    {
        if ( this == obj )
        {
            return true;
        }

        if ( !( obj instanceof InversionArtifactFilter ) )
        {
            return false;
        }

        InversionArtifactFilter other = (InversionArtifactFilter) obj;

        return toInvert.equals( other.toInvert );
}