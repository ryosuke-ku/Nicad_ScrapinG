//1609:maven/maven-artifact/src/main/java/org/apache/maven/artifact/versioning/VersionRange.java
//maven/maven-artifact/src/test/java/org/apache/maven/artifact/versioning/VersionRangeTest.java

public class Nicad_maven674
{
    public VersionRange cloneOf()
    {
        List<Restriction> copiedRestrictions = null;

        if ( restrictions != null )
        {
            copiedRestrictions = new ArrayList<>();

            if ( !restrictions.isEmpty() )
            {
                copiedRestrictions.addAll( restrictions );
            }
        }

        return new VersionRange( recommendedVersion, copiedRestrictions );
}