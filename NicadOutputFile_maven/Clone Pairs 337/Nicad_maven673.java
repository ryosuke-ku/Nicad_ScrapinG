//1608:maven/maven-artifact/src/main/java/org/apache/maven/artifact/ArtifactUtils.java
//maven/maven-artifact/src/test/java/org/apache/maven/artifact/ArtifactUtilsTest.java

public class Nicad_maven673
{
    private static <T> List<T> copyList( List<T> original )
    {
        List<T> copy = null;

        if ( original != null )
        {
            copy = new ArrayList<>();

            if ( !original.isEmpty() )
            {
                copy.addAll( original );
            }
        }

        return copy;
}