//1206:maven/maven-artifact/src/main/java/org/apache/maven/artifact/versioning/VersionRange.java
//maven/maven-artifact/src/test/java/org/apache/maven/artifact/versioning/VersionRangeTest.java

public class Nicad_maven495
{
    public boolean equals( Object obj )
    {
        if ( this == obj )
        {
            return true;
        }
        if ( !( obj instanceof VersionRange ) )
        {
            return false;
        }
        VersionRange other = (VersionRange) obj;

        boolean equals =
            recommendedVersion == other.recommendedVersion
                || ( ( recommendedVersion != null ) && recommendedVersion.equals( other.recommendedVersion ) );
        equals &=
            restrictions == other.restrictions
                || ( ( restrictions != null ) && restrictions.equals( other.restrictions ) );
        return equals;
}