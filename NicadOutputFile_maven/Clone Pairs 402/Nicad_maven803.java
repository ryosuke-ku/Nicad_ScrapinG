//1860:maven/maven-core/src/main/java/org/apache/maven/artifact/resolver/filter/IncludesArtifactFilter.java
//None

public class Nicad_maven803
{
    public boolean equals( Object obj )
    {
        if ( this == obj )
        {
            return true;
        }

        // make sure IncludesArtifactFilter is not equal ExcludesArtifactFilter!
        if ( obj == null || getClass() != obj.getClass() )
        {
            return false;
        }

        IncludesArtifactFilter other = (IncludesArtifactFilter) obj;

        return patterns.equals( other.patterns );
}