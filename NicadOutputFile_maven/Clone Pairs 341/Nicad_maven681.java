//1616:maven/maven-compat/src/main/java/org/apache/maven/artifact/ArtifactStatus.java
//None

public class Nicad_maven681
{
    public boolean equals( Object o )
    {
        if ( this == o )
        {
            return true;
        }
        if ( o == null || getClass() != o.getClass() )
        {
            return false;
        }

        final ArtifactStatus that = (ArtifactStatus) o;

        return rank == that.rank;

}