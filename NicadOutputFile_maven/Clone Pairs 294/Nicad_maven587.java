//1522:maven/maven-artifact/src/main/java/org/apache/maven/artifact/versioning/ComparableVersion.java
//maven/maven-artifact/src/test/java/org/apache/maven/artifact/versioning/ComparableVersionTest.java

public class Nicad_maven587
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

            BigIntegerItem that = (BigIntegerItem) o;

            return value.equals( that.value );

}