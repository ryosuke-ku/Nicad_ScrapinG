//1633:maven/maven-artifact/src/main/java/org/apache/maven/artifact/versioning/ComparableVersion.java
//maven/maven-artifact/src/test/java/org/apache/maven/artifact/versioning/ComparableVersionTest.java

public class Nicad_maven698
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

            IntItem intItem = (IntItem) o;

            return value == intItem.value;

}