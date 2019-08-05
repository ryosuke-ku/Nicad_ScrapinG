//1572:maven/maven-artifact/src/main/java/org/apache/maven/artifact/versioning/ComparableVersion.java
//maven/maven-artifact/src/test/java/org/apache/maven/artifact/versioning/ComparableVersionTest.java

public class Nicad_maven637
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

            StringItem that = (StringItem) o;

            return value.equals( that.value );

}