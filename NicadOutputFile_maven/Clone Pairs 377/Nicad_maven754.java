//1719:maven/maven-core/src/main/java/org/apache/maven/artifact/resolver/filter/ExclusionSetFilter.java
//None

public class Nicad_maven754
{
    public boolean equals( Object obj )
    {
        if ( this == obj )
        {
            return true;
        }

        if ( !( obj instanceof ExclusionSetFilter ) )
        {
            return false;
        }

        ExclusionSetFilter other = (ExclusionSetFilter) obj;

        return excludes.equals( other.excludes );
}