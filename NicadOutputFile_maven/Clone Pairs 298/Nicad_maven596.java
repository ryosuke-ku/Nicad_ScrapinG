//1531:maven/maven-compat/src/main/java/org/apache/maven/artifact/resolver/filter/TypeArtifactFilter.java
//None

public class Nicad_maven596
{
    public boolean equals( Object obj )
    {
        if ( this == obj )
        {
            return true;
        }

        if ( !( obj instanceof TypeArtifactFilter ) )
        {
            return false;
        }

        TypeArtifactFilter other = (TypeArtifactFilter) obj;

        return type.equals( other.type );
}